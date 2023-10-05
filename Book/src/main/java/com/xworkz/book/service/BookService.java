package com.xworkz.book.service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.ui.Model;

import com.xworkz.book.dto.BookDto;

public interface BookService {

	public boolean validate(BookDto dto, Model model);

	public boolean doExist(String bookName, Model model);

	public boolean save(BookDto dto, Model model);

	public BookDto findByName(String name, Model model);

	public List<BookDto> readAll();

}
