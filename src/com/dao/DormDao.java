package com.dao;

import java.util.List;

import com.bean.Dorm;

public interface DormDao {

	//返回所有的宿舍情况
	List<Dorm> findAll();
}
