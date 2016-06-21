package com.service.impl;

import java.util.List;

import com.bean.Book;
import com.dao.AdminDao;
import com.dao.BookDao;
import com.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookdao;
	
    public BookDao getBookdao() {//对于spring依赖注入，这个setter和getter规则是get/set+前面定义的变量名，并且这个变量名大小写要和前面一样，或者只能第一个字母大写
		return bookdao;
	}

	public void setBookdao(BookDao bookdao) {
		this.bookdao = bookdao;
	}
 
	@Override
	public List<Book> showAllBook() {
		// TODO Auto-generated method stub
		return bookdao.findAll();
	}

}
