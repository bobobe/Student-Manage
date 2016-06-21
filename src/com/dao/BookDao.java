package com.dao;

import java.util.List;

import com.bean.Book;

public interface BookDao {


	  /**
     * 查找图书借阅信息
     * @return list<book>
     */
    List<Book> findAll();
 
  
}
