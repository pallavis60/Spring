package com.xworkz.employee.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.xworkz.employee.constant.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "empl_info")
@NamedQuery(name = "findById", query = "select dto from EmployeeDto dto where dto.id=:id")
@NamedQuery(name = "findByNameAndId", query = "select dto from EmployeeDto dto where dto.id=:id And  dto.name=:nm")
@NamedQuery(name = "updateExpByName", query = "Update EmployeeDto dto set dto.experience=:exp where dto.name=:nm ")
@NamedQuery(name = "deleteByName", query = "delete EmployeeDto dto where dto.name=:nm")
@NamedQuery(name = "readAll", query = "select dto from EmployeeDto dto")
@NamedQuery(name="findByName",query="select dto from EmployeeDto dto where dto.name=:nm")
@Entity
public class EmployeeDto implements Serializable {

	@Id
	private int id;
	private String name;
	private String position;
	private String joingDate;
	private float experience;
	private String address;
	private String qualification;
	private float age;
	private Gender gender;
	private long contactNo;

}
