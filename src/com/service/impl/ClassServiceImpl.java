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

	public ClassDao getClassdao() {//对于spring依赖注入，这个setter和getter规则是get/set+前面定义的变量名，并且这个变量名大小写要和前面一样，或者只能第一个字母大写
		return classdao;
	}

}
