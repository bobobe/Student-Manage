package com.action;

import java.util.List;

import com.bean.Fee;
import com.opensymphony.xwork2.ActionSupport;
import com.service.FeeService;


/**
 * @author 闫博   
 * 显示全部学费上交信息
 *
 */
public class ShowAllFeeAction extends ActionSupport{
	private FeeService fs;
	
	//返回值
	private List<Fee> feelist;
	private String flag;

	public String execute() throws Exception {

		feelist = fs.showAllFee();
		flag = "showallfee";
        return "SUCCESS";
        
	}

	public List<Fee> getFeelist() {
		return feelist;
	}

	public void setFeelist(List<Fee> feelist) {
		this.feelist = feelist;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public FeeService getFs() {
		return fs;
	}

	public void setFs(FeeService fs) {
		this.fs = fs;
	}
}
