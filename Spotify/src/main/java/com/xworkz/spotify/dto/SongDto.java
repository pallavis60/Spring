package com.xworkz.spotify.dto;

import java.io.Serializable;
import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Spotify_songs")
@NamedQuery(name="read", query="Select dto from SongDto dto")
@NamedQuery(name="findByName" , query="Select dto from SongDto dto where dto.songTitle=:nm")
@NamedQuery(name="update" , query="update SongDto dto set dto.artistName=:an  where  dto.songTitle=:st")
@NamedQuery(name="delete", query="delete from SongDto dto where dto.songTitle=:sn")
@Entity
public class SongDto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String songTitle;
	private String movieName;
	private String artistName;
	private String duration;
	private URL songUrl;
	private Float rating;
	

}
