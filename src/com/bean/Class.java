package com.bean;
// default package



/**
 * Class entity. @author MyEclipse Persistence Tools
 */

public class Class  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer cid;
     private String college;
     private String info;


    // Constructors

    /** default constructor */
    public Class() {
    }

	/** minimal constructor */
    public Class(Integer cid, String college) {
        this.cid = cid;
        this.college = college;
    }
    
    /** full constructor */
    public Class(Integer cid, String college, String info) {
        this.cid = cid;
        this.college = college;
        this.info = info;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return this.cid;
    }
    
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCollege() {
        return this.college;
    }
    
    public void setCollege(String college) {
        this.college = college;
    }

    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }
   








}