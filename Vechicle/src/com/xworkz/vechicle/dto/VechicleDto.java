package com.xworkz.vechicle.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class VechicleDto  implements Serializable{
	
	private int id;
	private String name;
	private String type;
	private String color;
	private int price;

}
