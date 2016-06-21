package com.service;

import java.util.List;

import com.bean.Card;

public interface CardService {
	  //根据学号找一卡通
      public List<Card> findCardBySid(Integer sid);

}
