package com.action;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;


import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author �Ʋ�   
 * ѧ���˵�½
 *
 */
public class LoginAction extends ActionSupport {//login������
	
	    //���� Spring ����ע��
	    protected UserService us;     

	    //����ֵ
	    private String flag;
		private String cardnumber;
	    private String password;

	    //Spring����ע��Ķ��������get��set������������������get+��������Ϊ�˱��ڼ��䣬��������һ����ĸ���Դ�д��
	    public void setUs(UserService us)   
	    {
	        this.us = us;
	    }
	    
	    public UserService getUs()
	    {
	        return this.us;
	    }
	 
	    public String execute() throws Exception {
	        System.out.println("�����¼");
	        if(cardnumber.equals("") || cardnumber == null){
	        	flag = "nullinput";
	            return "FAILURE";
	        }
	       
	        Integer userid = us.validLogin(cardnumber, password);
	       
	        if (userid != null) {
	            System.out.println("�Ϸ��û�");
	            flag = "success";
	            
	            //�û���Ϣ���浽session
	            User user = us.getUserdao().findUserByCardNumber(cardnumber);
	            Map attibutes = ActionContext.getContext().getSession();  
	            attibutes.put("user",user);  
	            
	           return "SUCCESS";
	        } else {
	            //addActionError("�û���/���벻ƥ��");
	            System.out.println("�Ƿ��û�");
	            flag = "passworderror";
	            return "FAILURE";
	        }
	    }
	 
	    public String getPassword() {//������get��set action�����Զ����ܱ���ֵ
	        return password;
	    }
	 
	    public String getCardnumber() {
	        return cardnumber;
	    }
	 
	    public void setPassword(String password) {
	        this.password = password;
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

