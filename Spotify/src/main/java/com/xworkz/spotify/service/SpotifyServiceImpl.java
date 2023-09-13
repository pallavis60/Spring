package com.xworkz.spotify.service;

import java.net.URISyntaxException;
import java.util.List;

import javax.persistence.NoResultException;

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
		boolean valid =true;
		
		if(dto!=null ) {
			if(dto.getSongTitle()==null || dto.getSongTitle().length()<=3 || dto.getSongTitle().isEmpty()) {
				model.addAttribute("SongTitle", "Add Valid Song title");
				valid=false;
			}
			if(dto.getArtistName()==null || dto.getArtistName().length()<=3 || dto.getArtistName().length()>25 || dto.getArtistName().isEmpty()) {
				model.addAttribute("ArtistName", "Artist Name is not valid");
				valid=false;
			}
			if(dto.getMovieName()==null || dto.getMovieName().isEmpty() || dto.getMovieName().length()<5 ) {
				model.addAttribute("MovieName", "MovieName is not valid");
				valid=false;
			}
			try {
				if ( dto.getSongUrl()==null || dto.getSongUrl().toURI() ==null) {
					model.addAttribute("url", "Url is not valid");
					valid=false;
					
				}
			} catch (URISyntaxException e) {
				
				model.addAttribute("url", "Url is not valid");
				valid=false;
				e.printStackTrace();
			}
			if(dto.getDuration()==null || dto.getDuration().isEmpty()) {
				model.addAttribute("Duration", "Durartion is not valid");
				valid=false;
			}
			if( dto.getRating()==null  ||  dto.getRating()<0) {
				model.addAttribute("rating", "Rating is not valid");
				valid=false;
			}
		}
		System.out.println("dto is null");
		model.addAttribute("dtoValidate", "Dto is null");
		return valid=false;
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


	@Override
	public List<SongDto> readAll() {
		
		return repo.readAll();
	}


	@Override
	public SongDto findByName(String name, Model model) {
		
		if(name!=null && name.length()>3) {
			SongDto find = repo.findByName(name);
			if(find!=null) {
				 return find;
			}
			model.addAttribute("SongNotFound", "Song is not found");
			System.out.println("Song not found");
			return null;	
		} 			
		model.addAttribute("nameValidation", "Song Name is not valid");
        System.out.println("Song name is not valid");
		return null;
	}


	@Override
	public boolean updateArtistNameBySong(String artistName, String songTitle,Model model) {
		boolean valid=true;
		if(artistName==null || artistName.length()<3 ||artistName.isEmpty()) {
			model.addAttribute( "artistvalidate", "Given ArtistName is not valid");
			valid= false;
		}
			if(songTitle==null || songTitle.length()<3 || songTitle.isEmpty()) {
				model.addAttribute("songTitleValidate", "Given SongName is not valid");
				valid= false;
			}
				
			boolean update =repo.updateArtistNameBySong(artistName,songTitle);
			return update;
					
		
	}


	@Override
	public boolean deleteBySongName(String songTitle, Model model) {
		boolean valid=true;
		if(songTitle==null || songTitle.length()<3 || songTitle.isEmpty()) {
			model.addAttribute("songTitleValidate", "Given SongName is not valid");
			valid= false;
		}
		
		boolean dlt = repo.deleteBySongName( songTitle);
		return dlt;	
	
	}
}
	
	
