package com.service.impl;

import java.util.List;

import com.bean.Book;
import com.dao.AdminDao;
import com.dao.BookDao;
import com.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookdao;
	
    public BookDao getBookdao() {//����spring����ע�룬���setter��getter������get/set+ǰ�涨��ı����������������������СдҪ��ǰ��һ��������ֻ�ܵ�һ����ĸ��д
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
