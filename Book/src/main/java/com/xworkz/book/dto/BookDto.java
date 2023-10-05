package com.xworkz.book.dto;

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
@Table(name = "bookInfo")
@NamedQuery(name = "findByName", query = "select dto from BookDto dto where dto.bookName=:bn")
@NamedQuery(name = "readAll", query = "select dto from BookDto dto")
@Entity
public class BookDto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String bookName;
	private String author;
	private String publisher;
	private Integer publishedIn;
	private String language;
	private String content;

}
