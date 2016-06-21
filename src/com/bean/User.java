package com.bean;
// default package

import java.sql.Timestamp;


/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String sid;
     private String name;
     private String password;
     private Integer sex;
     private Timestamp birth;
     private String college;
     private Integer cid;
     private String dorm;
     private Integer bedid;
     private Integer tcredit;
     private Integer ncredit;


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String sid, Integer cid) {
        this.sid = sid;
        this.cid = cid;
    }
    
    /** full constructor */
    public User(String sid, String name, String password, Integer sex, Timestamp birth, String college, Integer cid, String dorm, Integer bedid, Integer tcredit, Integer ncredit) {
        this.sid = sid;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.birth = birth;
        this.college = college;
        this.cid = cid;
        this.dorm = dorm;
        this.bedid = bedid;
        this.tcredit = tcredit;
        this.ncredit = ncredit;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getSid() {
        return this.sid;
    }
    
    public void setSid(String cardnumber) {
        this.sid = cardnumber;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return this.sex;
    }
    
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Timestamp getBirth() {
        return this.birth;
    }
    
    public void setBirth(Timestamp birth) {
        this.birth = birth;
    }

    public String getCollege() {
        return this.college;
    }
    
    public void setCollege(String college) {
        this.college = college;
    }

    public Integer getCid() {
        return this.cid;
    }
    
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getDorm() {
        return this.dorm;
    }
    
    public void setDorm(String dorm) {
        this.dorm = dorm;
    }

    public Integer getBedid() {
        return this.bedid;
    }
    
    public void setBedid(Integer bedid) {
        this.bedid = bedid;
    }

    public Integer getTcredit() {
        return this.tcredit;
    }
    
    public void setTcredit(Integer tcredit) {
        this.tcredit = tcredit;
    }

    public Integer getNcredit() {
        return this.ncredit;
    }
    
    public void setNcredit(Integer ncredit) {
        this.ncredit = ncredit;
    }
   








}