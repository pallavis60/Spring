package com.xworkz.spotify.service;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.spotify.dto.SongDto;

public interface SpotifyService {
	
	public boolean validate(SongDto dto,Model model);
	
	public boolean saveSong(SongDto dto,Model model);
	
	public List<SongDto> readAll();
	
	public SongDto  findByName(String name,Model mode);
	
	public boolean updateArtistNameBySong(String artistName,String songTitle,Model model);
	
	public boolean deleteBySongName(@RequestParam String songTitle,Model model);

}
