package com.dao;

import java.util.List;

import com.bean.Book;

public interface BookDao {


	  /**
     * ����ͼ�������Ϣ
     * @return list<book>
     */
    List<Book> findAll();
 
  
}
