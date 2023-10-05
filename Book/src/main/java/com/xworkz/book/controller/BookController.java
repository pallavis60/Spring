package com.xworkz.book.controller;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.book.dto.BookDto;
import com.xworkz.book.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService service;

	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
	public String create(BookDto dto, Model model) {
		System.out.println(dto);
		boolean save = service.save(dto, model);
		service.doExist(dto.getBookName(), model);
		if (save) {
			model.addAttribute("saved", "Data is saved");
			return "Create";
		} else {
			System.out.println("Data is not saved");
			model.addAttribute("saved", "Data is not saved");
			return "Create";
		}

	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String readAll(Model model) {
		List<BookDto> dto = service.readAll();
		model.addAttribute("dto", dto);
		System.out.println(dto);
		return "Read";

	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(@RequestParam String bookName, Model model) {
		BookDto dto = service.findByName(bookName, model);
		if (dto != null) {
			model.addAttribute("dto", dto);
			return "Search";
		}
		model.addAttribute("find", "BookNot Found");
		return "Read";
	}

}
