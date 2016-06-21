package com.action;

import java.io.InputStream;
import java.io.PrintWriter;


import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author �Ʋ�   
 * ע��
 *
 */
public class RegisterAction extends ActionSupport {//login������
	 //private static final long serialVersionUID = 1L;
	 
	    protected UserService us;     //�ö������ Spring ����ע��

	    //����ֵ
	    private String flag;
		private String cardnumber;
	    private String password;
	    private String confirpassword;

		private String name;

		public String execute() throws Exception {
	        System.out.println("���ע��");
	        if(name.equals("")|| password.equals("")||confirpassword.equals("")){
	        	flag = "nullinput";
	            return "FAILURE";
	        }
	       
	        int tag = us.validRegister(name,password,confirpassword,cardnumber);
	       
	        if (tag == 0) {
	            System.out.println("�ѱ�ע��");
	            flag = "alreadyexists";
	           return "FAILURE";
	        } else if(tag == 2){
	        	flag = "�����������벻һ��";
	            System.out.println("���벻ͬ");
	            flag = "passworderror";
	            return "FAILURE";
	        }
	        else
	        {
	        	System.out.println("ע��ɹ�");
	            flag = "success";
	            return "SUCCESS";
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
	    
	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String getConfirpassword() {
			return confirpassword;
		}

		public void setConfirpassword(String confirpassword) {
			this.confirpassword = confirpassword;
		}
	    
	    public String getFlag() {//���ظ�jspҳ���ֵҲ��Ҫ��get��set
			return flag;
		}

		public void setFlag(String flag) {
			this.flag = flag;
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

}

