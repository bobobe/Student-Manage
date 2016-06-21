package com.action;

import java.util.List;

import com.bean.Card;
import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CardService;
import com.service.UserService;


/**
 * @author 闫博   
 * 返回一卡通信息
 *
 */
public class SearchCardAction extends ActionSupport{

	protected CardService cs;
	
	//接受值
    private Integer sid;
    
    //返回值
    private List<Card> cardlist;
    private String flag;
	
	public String execute() throws Exception {
        System.out.print("返回一卡通信息");
        System.out.print(sid);
		cardlist = cs.findCardBySid(sid);
		flag = "showcardinfo";
        return "SUCCESS";
        
	}

	public CardService getCs() {
		return cs;
	}

	public Integer getSid() {
		return sid;
	}

	public void setCs(CardService cs) {
		this.cs = cs;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public List<Card> getCardlist() {
		return cardlist;
	}

	public void setCardlist(List<Card> cardlist) {
		this.cardlist = cardlist;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}

