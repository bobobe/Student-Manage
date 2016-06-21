package com.service;

import java.util.List;

import com.bean.Dorm;
import com.bean.Fee;

public interface FeeService {
	public List<Fee> showAllFee();//返回所有费用信息
	
	//修改学生上交学费状态
	public void updateHandFee(Fee fee);
	
	public void handInFee(String sid);

}
