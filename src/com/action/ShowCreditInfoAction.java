package com.action;

import com.opensymphony.xwork2.ActionSupport;


/**
 * @author �Ʋ�   
 * ��ʾѧ��ѧ����Ϣ
 *
 */
public class ShowCreditInfoAction extends ActionSupport{

	//����ֵ
	private String flag;
	
	//������
    public String execute() throws Exception {
        System.out.println("����ѧ����Ϣ");
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
