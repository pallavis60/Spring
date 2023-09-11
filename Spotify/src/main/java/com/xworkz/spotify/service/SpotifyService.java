package com.xworkz.spotify.service;

import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SongDto;

public interface SpotifyService {
	
	public boolean validate(SongDto dto,Model model);
	
	public boolean saveSong(SongDto dto,Model model);

}
