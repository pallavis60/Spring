package com.xworkz.exam.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.xworkz.exam.constant.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="exam_info")
@NamedQuery(name="findByName", query="select dto from ExamDto dto where dto.studentName=:nm")
@Entity

public class ExamDto implements Serializable {
	
	@Id
	private int id;
	private Department department;
	private int rollNo;
	private  String studentName;
	private String subject;
	private float timimg;
	private String date;
	

}
