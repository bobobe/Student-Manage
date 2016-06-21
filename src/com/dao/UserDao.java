package com.dao;
import java.util.List;

import com.bean.*;

public interface UserDao {

	 
	    /**
	     * ����id�����û�
	     * @param id ��Ҫ���ҵ��û�id
	     */ 
	    User get(Integer id);
	    /**
	     * �����û�
	     * @param user ��Ҫ���ӵ��û�
	     */      
	    void save(User user);
	 
	    /**
	     * �޸��û�
	     * @param user ��Ҫ�޸ĵ��û�
	     */ 
	    void update(User user);
	 
	    /**
	     * ɾ���û�
	     * @param id ��Ҫɾ�����û�id
	     */ 
	    void delete(Integer id);
	 
	    /**
	     * ɾ���û�
	     * @param user ��Ҫɾ�����û�
	     */ 
	    void delete(User user);
	 
	    /**
	     * ��ѯȫ���û�
	     * @return ���ȫ���û�
	     */
	    
	    List<User> findAll();
	 
	    /**
	     * �����û�������������û�
	     * @param username ��ѯ������û���
	     * @param pass ��ѯ���������
	     * @return ��Ӧ���û�
	     */
	    User findUserByNumberAndPass(String cardnumber , String password);
	    /**
	     * ����ѧ�Ų����û�
	     * @param cardnumber ��ѯ�����ѧ��
	     * @return ��Ӧ���û�
	     */
	    User findUserByCardNumber(String cardnumber);
	    /**
	     * ���ݰ༶�����û�
	     * @param cid ��ѯ����İ༶��
	     * @return ��Ӧ���û�
	     */
	    List<User> findUserByCid(String cid);
	    /**
	     * ������������û�
	     * @param dormname ��ѯ�����������
	     * @return ��Ӧ���û�
	     */
	    List<User> findUserByDorm(String dormname);
	    /**
	     * �������ֲ����û�
	     * @param dormname ��ѯ������û���
	     * @return ��Ӧ���û�
	     */
		User findUserByName(String name);
	    


}
