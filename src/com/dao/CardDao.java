package com.dao;

import java.util.List;

import com.bean.Admin;
import com.bean.Book;
import com.bean.Card;

public interface CardDao {

	/**
     * 根据id查找用户
     * @param sid 需要查找的用户card记录
     */ 
	List<Card> findCardBySid(Integer sid);
    
}
