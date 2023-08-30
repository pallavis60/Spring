package com.xworkz.school.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;  
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="scl_info")
@Entity
public class SchoolDto implements Serializable {
	
	@Id
	private int id;
	private String name;
	private int stand;
	private String clsTeacher;
	private long parentContactNo;
	
	

}
