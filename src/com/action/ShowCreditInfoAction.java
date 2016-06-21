package com.action;

import com.opensymphony.xwork2.ActionSupport;


/**
 * @author 闫博   
 * 显示学生学分信息
 *
 */
public class ShowCreditInfoAction extends ActionSupport{

	//返回值
	private String flag;
	
	//主方法
    public String execute() throws Exception {
        System.out.println("返回学分信息");
        flag = "showcreditinfo";
        return "SUCCESS";
    }

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
}
