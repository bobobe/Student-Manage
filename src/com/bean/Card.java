package com.bean;
// default package

import java.sql.Timestamp;


/**
 * Card entity. @author MyEclipse Persistence Tools
 */

public class Card  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Timestamp addDate;
     private Double infor;
     private Integer isLost;
     private Integer sid;
     private Double remain;


    // Constructors

    /** default constructor */
    public Card() {
    }

	/** minimal constructor */
    public Card(Integer isLost, Integer sid) {
        this.isLost = isLost;
        this.sid = sid;
    }
    
    /** full constructor */
    public Card(Timestamp addDate, Double infor, Integer isLost, Integer sid, Double remain) {
        this.addDate = addDate;
        this.infor = infor;
        this.isLost = isLost;
        this.sid = sid;
        this.remain = remain;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getAddDate() {
        return this.addDate;
    }
    
    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    public Double getInfor() {
        return this.infor;
    }
    
    public void setInfor(Double infor) {
        this.infor = infor;
    }

    public Integer getIsLost() {
        return this.isLost;
    }
    
    public void setIsLost(Integer isLost) {
        this.isLost = isLost;
    }

    public Integer getSid() {
        return this.sid;
    }
    
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Double getRemain() {
        return this.remain;
    }
    
    public void setRemain(Double remain) {
        this.remain = remain;
    }
   








}