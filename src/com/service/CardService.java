package com.service;

import java.util.List;

import com.bean.Card;

public interface CardService {
	  //����ѧ����һ��ͨ
      public List<Card> findCardBySid(Integer sid);

}
