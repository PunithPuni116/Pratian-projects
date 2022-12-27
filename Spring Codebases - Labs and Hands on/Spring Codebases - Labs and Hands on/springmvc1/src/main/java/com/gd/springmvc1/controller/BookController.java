package com.gd.springmvc1.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gd.springmvc1.dao.BookDao;
import com.gd.springmvc1.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/showBooks.html")
	public ModelAndView showBookhandler() {
		//Create a collection of books
		List<String> books = new ArrayList<String>();
		books.add("Death An Inside Story");
		books.add("The Java Guide");
		books.add(" Inside Story");
		books.add("The Guide");
		
//		books = bookService.getAllBooks();
		Map<String,Object> modelObj = new HashMap();
		modelObj.put("bookList", books); 
		return new ModelAndView("showBooksList","model",modelObj);
		
	}
	
	@RequestMapping(value = "/addBook.html")
	public String addBookHandler() {
		return "addBook";
		
	}
	
	@RequestMapping(value = "/saveBook.html",method = RequestMethod.POST)
	public String saveBookHandler(HttpServletRequest request, Model model) {
		String book = request.getParameter("bookName");
		model.addAttribute("bookAttr", book);
		bookService.addBook(book);
		return "saveBook";
	}

}
