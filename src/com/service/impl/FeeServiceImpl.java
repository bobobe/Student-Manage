package com.service.impl;

import java.util.List;

import com.bean.Fee;
import com.dao.FeeDao;
import com.service.FeeService;

public class FeeServiceImpl implements FeeService {
    private FeeDao feedao;
	@Override
	public List<Fee> showAllFee() {
		// TODO Auto-generated method stub
		return feedao.findAll();
	}
	
	public FeeDao getFeedao() {
		return feedao;
	}
	public void setFeedao(FeeDao feedao) {
		this.feedao = feedao;
	}

	@Override
	public void updateHandFee(Fee fee) {
		// TODO Auto-generated method stub
		feedao.update(fee);
	}

	//根据学号修改缴费状态
	@Override
	public void handInFee(String sid) {
		// TODO Auto-generated method stub
		feedao.updatefeestatus(sid);
		
	}

}
