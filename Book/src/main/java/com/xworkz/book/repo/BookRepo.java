package com.xworkz.book.repo;

import java.util.List;

import javax.persistence.NoResultException;

import com.xworkz.book.dto.BookDto;

public interface BookRepo {

	public boolean save(BookDto dto);

	public BookDto findBYName(String name);

	public List<BookDto> readAll();

}
