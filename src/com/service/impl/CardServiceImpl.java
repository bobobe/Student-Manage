package com.service.impl;

import java.util.List;

import com.bean.Card;
import com.dao.BookDao;
import com.dao.CardDao;
import com.service.CardService;

public class CardServiceImpl implements CardService {

	private CardDao carddao;
	
	@Override
	public List<Card> findCardBySid(Integer sid) {
		// TODO Auto-generated method stub
		return this.carddao.findCardBySid(sid);
	}

	public CardDao getCarddao() {
		return carddao;
	}

	public void setCarddao(CardDao carddao) {
		this.carddao = carddao;
	}

}
