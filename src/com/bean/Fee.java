package com.bean;
// default package



/**
 * Fee entity. @author MyEclipse Persistence Tools
 */

public class Fee  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String sid;
     private String dormFee;
     private String classFee;
     private String schoolFee;
     private String isHand;


    // Constructors

    /** default constructor */
    public Fee() {
    }

    
    /** full constructor */
    public Fee(String sid, String dormFee, String classFee, String schoolFee, String isHand) {
        this.sid = sid;
        this.dormFee = dormFee;
        this.classFee = classFee;
        this.schoolFee = schoolFee;
        this.isHand = isHand;
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
    
    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getDormFee() {
        return this.dormFee;
    }
    
    public void setDormFee(String dormFee) {
        this.dormFee = dormFee;
    }

    public String getClassFee() {
        return this.classFee;
    }
    
    public void setClassFee(String classFee) {
        this.classFee = classFee;
    }

    public String getSchoolFee() {
        return this.schoolFee;
    }
    
    public void setSchoolFee(String schoolFee) {
        this.schoolFee = schoolFee;
    }

    public String getIsHand() {
        return this.isHand;
    }
    
    public void setIsHand(String isHand) {
        this.isHand = isHand;
    }
   








}