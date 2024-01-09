package com.douglas.readvista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.readvista.dtos.BookDTO;
import com.douglas.readvista.entities.Book;
import com.douglas.readvista.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookResource {

	@Autowired
	private BookService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<BookDTO> findById(@PathVariable Integer id){
		Book obj = service.findById(id);
		return ResponseEntity.ok().body(new BookDTO(obj));
	}
}