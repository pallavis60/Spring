package com.xworkz.watch.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WatchDto implements Serializable {
	
	private Integer id;
	private String brandName;
	private Integer price;
	private List<String> branches;
	private String color;
	

}
