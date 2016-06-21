package com.dao;

import java.util.List;

import com.bean.Admin;

public interface AdminDao {

	/**
     * 根据id查找用户
     * @param id 需要查找的用户id
     */ 
    Admin get(Integer id);
    /**
     * 增加用户
     * @param user 需要增加的用户
     */      
    void save(Admin admin);
 
    /**
     * 修改用户
     * @param user 需要修改的用户
     */ 
    void update(Admin admin);
 
    /**
     * 查询全部管理员
     * @return 获得全部管理员
     */
    List<Admin> findAll();
 
    /**
     * 根据用户名，密码查找用户
     * @param username 查询所需的用户名
     * @param pass 查询所需的密码
     * @return 对应的用户
     */
    Admin findAdminByNameAndPass(String username , String password);
}
