package com.xworkz.spotify.repo;

import java.util.List;



import com.xworkz.spotify.dto.SongDto;


public interface SpotifyRepo {
	
	public boolean save(SongDto dto);

	public List<SongDto> readAll();
	
	public SongDto findByName(String name) ;

	public boolean  updateArtistNameBySong(String artistName, String songTitle);

	public boolean deleteBySongName(String songTitle);
	
	



}
