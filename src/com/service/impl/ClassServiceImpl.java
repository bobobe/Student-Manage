package com.service.impl;

import java.util.List;

import com.bean.Book;
import com.dao.BookDao;
import com.dao.ClassDao;
import com.service.ClassService;

public class ClassServiceImpl implements ClassService {

	 private ClassDao classdao;
		
	@Override
	public List<Class> showAllClass() {
		// TODO Auto-generated method stub
		return classdao.findAll();
	}
	
	 public void setClassdao(ClassDao classdao) {
	    this.classdao = classdao;
    }

	public ClassDao getClassdao() {//����spring����ע�룬���setter��getter������get/set+ǰ�涨��ı����������������������СдҪ��ǰ��һ��������ֻ�ܵ�һ����ĸ��д
		return classdao;
	}

}
