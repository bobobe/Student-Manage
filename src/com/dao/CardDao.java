package com.dao;

import java.util.List;

import com.bean.Admin;
import com.bean.Book;
import com.bean.Card;

public interface CardDao {

	/**
     * ����id�����û�
     * @param sid ��Ҫ���ҵ��û�card��¼
     */ 
	List<Card> findCardBySid(Integer sid);
    
}
