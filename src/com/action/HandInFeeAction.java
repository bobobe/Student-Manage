package com.action;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.FeeService;
import com.service.UserService;


/**
 * @author 闫博   
 * 修改学费上交状态
 *
 */
public class HandInFeeAction extends ActionSupport{

	
	protected FeeService fs;
	
	//接受值
	private String sid;
	private Boolean checkMe;
	
	public String execute() throws Exception {
		

		if(checkMe ==true)
		{
             fs.handInFee(sid);
		}
        return "SUCCESS";
        
	}

	

	public FeeService getFs() {
		return fs;
	}

	public void setFs(FeeService fs) {
		this.fs = fs;
	}



	public Boolean getCheckMe() {
		return checkMe;
	}



	public void setCheckMe(Boolean checkMe) {
		this.checkMe = checkMe;
	}



	public String getSid() {
		return sid;
	}



	public void setSid(String sid) {
		this.sid = sid;
	}


}
