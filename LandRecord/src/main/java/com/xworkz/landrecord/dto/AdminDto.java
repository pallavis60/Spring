package com.xworkz.landrecord.dto;

import java.io.Serializable;

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
@Table(name="admindto")
@NamedQuery(name="findByEmail" , query="Select dto from AdminDto dto where dto.email=:em")
@NamedQuery(name="updateOtpByEmail", query="Update AdminDto dto set dto.otp=:otp where dto.email=:em ")
@NamedQuery(name="findOtp" , query="select dto from AdminDto dto where dto.otp=:otp")
@Entity

public class AdminDto implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String adminName;
	private String email;
	private String otp;

}
