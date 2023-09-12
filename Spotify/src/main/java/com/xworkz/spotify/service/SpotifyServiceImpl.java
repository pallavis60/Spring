package com.xworkz.spotify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SongDto;
import com.xworkz.spotify.repo.SpotifyRepo;

@Service
public class SpotifyServiceImpl implements SpotifyService {
	
	@Autowired
	private SpotifyRepo repo;

	@Override
	public boolean validate(SongDto dto,Model model) {
		
		if(dto!=null) {
			if(dto.getSongTitle()!=null && !dto.getSongTitle().isEmpty()) {
				if(dto.getArtistName()!=null && dto.getArtistName().length()>3 && dto.getArtistName().length()<25) {
					if(dto.getMovieName()!=null && !dto.getMovieName().isEmpty()) {
						if(dto.getDuration()!=null) {
							if(dto.getRating()!=null && dto.getRating()>0.0f) {
								if(dto.getSongUrl()!=null) {
									
								System.out.println("Data is validate");
								return true;
								}
								model.addAttribute("url", "MentionValidUrl");
								return false;
								
							}
							model.addAttribute("rating", "rating is not valid");
							return false;
						}
						model.addAttribute("Duration", "Duration is not valid");
						return false;
					}
					model.addAttribute("MovieName", "MovieName is not valid");
					return false;
				}
				
				model.addAttribute("ArtistName", "Artist is not valid");
				return false;
			}
			
			model.addAttribute("SongTitle", "SongTitle is not valid");
			return false;
		}
			
		model.addAttribute("dtoValidate", "Dto is not valid");
		return false;
	}
	
	
	
	public boolean saveSong(SongDto dto , Model model) {
		
		boolean valid =  validate(dto,model);
		
		if(valid==true) {
			repo.save(dto);
			return true;
			
		}else {
			return false;
		}
	}
}