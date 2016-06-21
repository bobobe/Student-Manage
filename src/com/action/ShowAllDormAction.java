package com.action;

import java.util.List;

import com.bean.Dorm;
import com.opensymphony.xwork2.ActionSupport;
import com.service.DormService;


/**
 * @author 闫博   
 * 显示所有宿舍信息
 *
 */
public class ShowAllDormAction extends ActionSupport{
	private DormService ds;
	
	//返回值
	private List<Dorm> dormlist;
	private String flag;

	public String execute() throws Exception {

		dormlist = ds.showAllDorm();
		flag = "showalldorm";
        return "SUCCESS";
        
	}

	public DormService getDs() {
		return ds;
	}

	public void setDs(DormService ds) {
		this.ds = ds;
	}

	public List<Dorm> getDormlist() {
		return dormlist;
	}

	public void setDormlist(List<Dorm> dormlist) {
		this.dormlist = dormlist;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
}
