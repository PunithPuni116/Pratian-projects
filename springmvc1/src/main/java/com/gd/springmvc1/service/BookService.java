package com.gd.springmvc1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gd.springmvc1.dao.BookDao;

@Service
public class BookService {
	
	@Autowired
	private BookDao bookDao;
	
	public boolean addBook(String book) {
		return bookDao.saveBook(book);
	}
	
	public List<String> getAllBooks(){
		return bookDao.findbooks();
	}

}
