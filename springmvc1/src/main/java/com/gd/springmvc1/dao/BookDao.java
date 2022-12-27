package com.gd.springmvc1.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	
	List<String> books = new ArrayList<String>();
	
	public BookDao() {
		
	}
	
	
	public boolean saveBook(String book) {
		return this.books.add(book);
	}
	
	public List<String> findbooks(){
		return this.books;
	}

}
