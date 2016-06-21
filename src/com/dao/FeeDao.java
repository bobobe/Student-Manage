package com.dao;

import java.util.List;

import com.bean.Admin;
import com.bean.Dorm;
import com.bean.Fee;
import com.bean.User;

public interface FeeDao {

	List<Fee> findAll();
	
	void update(Fee fee);
	
	void updatefeestatus(String sid);
}
