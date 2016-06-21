package com.dao;

import java.util.List;

import com.bean.Admin;

public interface AdminDao {

	/**
     * ����id�����û�
     * @param id ��Ҫ���ҵ��û�id
     */ 
    Admin get(Integer id);
    /**
     * �����û�
     * @param user ��Ҫ���ӵ��û�
     */      
    void save(Admin admin);
 
    /**
     * �޸��û�
     * @param user ��Ҫ�޸ĵ��û�
     */ 
    void update(Admin admin);
 
    /**
     * ��ѯȫ������Ա
     * @return ���ȫ������Ա
     */
    List<Admin> findAll();
 
    /**
     * �����û�������������û�
     * @param username ��ѯ������û���
     * @param pass ��ѯ���������
     * @return ��Ӧ���û�
     */
    Admin findAdminByNameAndPass(String username , String password);
}
