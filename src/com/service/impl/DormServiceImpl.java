package com.service.impl;

import java.util.List;

import com.bean.Dorm;
import com.dao.DormDao;
import com.service.DormService;

public class DormServiceImpl implements DormService {
	private DormDao dormdao;

	public DormServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Dorm> showAllDorm() {
		// TODO Auto-generated method stub
		return dormdao.findAll();
	}

	public DormDao getDormdao() {
		return dormdao;
	}

	public void setDormdao(DormDao dormdao) {
		this.dormdao = dormdao;
	}

}
