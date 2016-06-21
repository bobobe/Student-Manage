package com.action;

import java.util.Map;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author �Ʋ�   
 * ����������ѧ����Ϣ
 *
 */
public class SearchStudentAction extends ActionSupport {

	protected UserService us;
	
	//����ֵ
	private int type;//��type��ѯ
	private String value;//ֵ
	
	//����ֵ
	User user;
	String flag;
	
	
	public String execute() throws Exception {
        System.out.println("��type��ѯ");
        if(value==null)
        {
        	flag = "searchstudentform";
        	return "SHOWFORM";
        }
        switch(type)
        {
	        case 0 ://��ѧ��
	        user = us.searchStudentBycardnumber(value);
	        	break;
	        case 1://������
	        user = us.searchStudentByName(value);
	            break;
        }
        if(user!=null)
        {
        	flag = "searchstudentsuccess";
        	 //�û���Ϣ���浽session
        	System.out.print("���û����浽session");
            Map attibutes = ActionContext.getContext().getSession();  
            attibutes.put("user",user);  
        }
        else
        {
        	flag = "searchstudentnotfound";
        }
        return "SUCCESS";
    }

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}


	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
