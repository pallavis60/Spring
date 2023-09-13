package com.xworkz.spotify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.spotify.dto.SongDto;
import com.xworkz.spotify.service.SpotifyService;

@Controller
public class SpotifyController {
	
	
	@Autowired
	private SpotifyService service;
	
	@RequestMapping(value="/save" , method=RequestMethod.POST)
	public String addSongs(SongDto dto,Model model) {
		
		System.out.println(dto);
		
boolean save =	service.saveSong(dto, model);
		if(save) {
			model.addAttribute("dto", dto);
			return "Success";
		}else {
			return "AddSong";
		}
	}
	
	@RequestMapping(value="/read" , method=RequestMethod.GET)
	public String readAll(Model model) {
		
	List<SongDto> dto =service.readAll();
	model.addAttribute("readDto", dto);
	System.out.println(dto);
		return "Read";
		
	}
	
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public String findByName(@RequestParam String songTitle , Model model) {
	SongDto findedSong =	service.findByName(songTitle, model);
	model.addAttribute("finded", findedSong);
	
	return "FindSong";
		
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.POST)
	public String updateArtistNameBySong(@RequestParam String  artistName,@RequestParam String songTitle,Model model) {
	boolean update =	service.updateArtistNameBySong(artistName, songTitle, model);
	if(update) {
		model.addAttribute("dataUpdated", "Data is updated");
		return "Update";
	}else {
		
		model.addAttribute("dataUpdated", "Data is Not updated");
		return "Update";
		
	}

	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String deleteBySongName(@RequestParam String songTitle,Model model) {
		boolean delete = service.deleteBySongName(songTitle, model);
		
		if(delete) {
			model.addAttribute("deleted", "Data is Deleted");
			return "Update";
		}else {
			model.addAttribute("deleted", "Data is not delete");
					return "Update";
		}
		
	}
		
		
	}
	
	


