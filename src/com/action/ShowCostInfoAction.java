package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author �Ʋ�   
 * ��ʾѧ��������Ϣ
 *
 */
public class ShowCostInfoAction extends ActionSupport{
	   
	   //����ֵ
	   private Integer ncredit;
	   
	   //����ֵ
	   private String flag;
	   private Integer cost;
	   
    public String execute() throws Exception {
        System.out.println("���ط�����Ϣ");
        cost = ncredit*75;
        flag = "showcostinfo";
        return "SUCCESS";
    }
    
   
	public Integer getNcredit() {
		return ncredit;
	}
	
	public void setNcredit(Integer ncredit) {
		this.ncredit = ncredit;
	}


	public String getFlag() {
		return flag;
	}


	public Integer getCost() {
		return cost;
	}


	public void setFlag(String flag) {
		this.flag = flag;
	}


	public void setCost(Integer cost) {
		this.cost = cost;
	}
	
}
