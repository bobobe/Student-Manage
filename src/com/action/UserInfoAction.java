package com.action;

import java.util.Map;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author �Ʋ�   
 * ��ʾָ��ѧ��ȫ����Ϣ
 *
 */
public class UserInfoAction extends ActionSupport{
	
	//������� Spring ����ע��
	protected UserService us;  
	
    //����ֵ
	private String cardnumber;
	
	//����ֵ
	private User user;
	private String flag;
	
	//������
    public String execute() throws Exception {
        System.out.println("��ȡ�û���Ϣ");
        user = us.getUserdao().findUserByCardNumber(cardnumber);
        flag = "searchstudentsuccess";
        //�û���Ϣ���浽session
    	System.out.print("���û����浽session");
        Map attibutes = ActionContext.getContext().getSession();  
        attibutes.put("user",user);  
        return "SUCCESS";
    }
    
    //getter��setter
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
    //Spring����ע��Ķ��������get��set������������������get+��������Ϊ�˱��ڼ��䣬��������һ����ĸ���Դ�д��
    public void setUs(UserService us)   
    {
        this.us = us;
    }
    
    public UserService getUs()
    {
        return this.us;
    }

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
 
}
