package com.action;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AdminService;


/**
 * @author �Ʋ�   
 * ����Ա��½
 *
 */
public class SuperLoginAction extends ActionSupport{

	protected AdminService as;     //�ö������ Spring ����ע��
	   
	//����ֵ
    private String adminname;
    private String password;
    //����ֵ
    private String flag;

    //Spring����ע��Ķ��������get��set������������������get+��������Ϊ�˱��ڼ��䣬��������һ����ĸ���Դ�д��
    public void setAs(AdminService as)   
    {
        this.as = as;
    }
    
    public AdminService getAs()
    {
        return this.as;
    }
 
    public String execute() throws Exception {
        System.out.println("�����¼");
        if(adminname.equals("") || password.equals("")){
        	flag = "nullinput";
            return "FAILURE";
        }
       
        Integer userId = as.validLogin(adminname, password);
       
        if (userId != null) {
            System.out.println("�Ϸ��û�");
            System.out.print("������Ա��Ϣ���浽session");
            Map attibutes = ActionContext.getContext().getSession();  
            attibutes.put("admin",adminname);  
            return "SUCCESS";
        } else {
            System.out.println("�Ƿ��û�");
            flag = "passworderror";
            return "FAILURE";
        }
    }
 
    public String getPassword() {//������get��set action�����Զ����ܱ���ֵ
        return password;
    }
 
    public String getAdminname() {
        return adminname;
    }
 
    public void setPassword(String password) {//���������ֵҲ�����ǰ̨ҳ���Ӧ��nameһ��
        this.password = password;
    }
 
    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
   
}
