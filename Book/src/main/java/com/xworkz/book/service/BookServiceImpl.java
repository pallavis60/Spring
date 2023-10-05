package com.xworkz.book.service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.book.dto.BookDto;
import com.xworkz.book.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepo repo;

	@Override
	public boolean validate(BookDto dto, Model model) {
		System.out.println("Validation");
		boolean valid = true;
		if (dto == null) {
			System.out.println("dto is null");
			model.addAttribute("dtoValidate", "Dto is null");
			valid = false;
		}

		if (!doExist(dto.getBookName(), model)) {
			System.out.println("ThisBookName is already present ");
			model.addAttribute("doExist", "ThisBookName is already present");
			valid = false;
		}

		if (dto.getBookName() == null || dto.getBookName().isEmpty() || dto.getBookName().length() <= 3) {
			model.addAttribute("BookName", "BookName is Not valid");
			valid = false;
		}
		if (dto.getAuthor() == null || dto.getAuthor().isEmpty() || dto.getAuthor().length() <= 3
				|| dto.getAuthor().length() > 25) {
			model.addAttribute("Author", "Author Name is not valid");
			valid = false;
		}
		if (dto.getPublisher() == null || dto.getPublisher().isEmpty() || dto.getPublisher().length() <= 3
				|| dto.getPublisher().length() > 25) {
			model.addAttribute("publisher", "Publisher Name is not valid");
			valid = false;
		}
		if (dto.getLanguage() == null || dto.getLanguage().isEmpty()) {
			model.addAttribute("lang", "Language is not valid");
			valid = false;
		}
		if (dto.getPublishedIn() == null || dto.getPublishedIn() < 0 || dto.getPublishedIn() < 1700) {
			model.addAttribute("pulishedIn", "Add Published Year Correctly");
			valid = false;
		}
		if (dto.getContent() == null || dto.getContent().isEmpty()) {
			model.addAttribute("content", "Content is not valid");
			valid = false;
		}
		return valid;

	}

	public boolean save(BookDto dto, Model model) {
		boolean result = validate(dto, model);
		if (result == true) {
			System.out.println("Data is valid, ready to save");
			return repo.save(dto);

		}
		return result;

	}

	@Override
	public BookDto findByName(String name, Model model) {
		if (name != null && name.length() >= 3 && !name.isEmpty()) {
			System.out.println("Name is valid");
			return repo.findBYName(name);

		}
		model.addAttribute("nameValidate", "Name is not valid");
		return null;
	}

	@Override
	public List<BookDto> readAll() {

		return repo.readAll();
	}

	@Override
	public boolean doExist(String bookName, Model model) {

		BookDto dto = findByName(bookName, model);
		if (dto == null) {
			System.out.println("No Entity found By Do Exist");
			return true;

		}
		System.out.println(" Entity found By Do Exist");
		return false;
	}
}
