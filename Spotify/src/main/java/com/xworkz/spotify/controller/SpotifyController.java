package com.xworkz.spotify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

}
