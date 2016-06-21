package com.bean;
// default package



/**
 * Dorm entity. @author MyEclipse Persistence Tools
 */

public class Dorm  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private Integer isFix;
     private String score;
     private Integer pnum;
     private Integer isModel;
     private String info;


    // Constructors

    /** default constructor */
    public Dorm() {
    }

    
    /** full constructor */
    public Dorm(String name, Integer isFix, String score, Integer pnum, Integer isModel, String info) {
        this.name = name;
        this.isFix = isFix;
        this.score = score;
        this.pnum = pnum;
        this.isModel = isModel;
        this.info = info;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsFix() {
        return this.isFix;
    }
    
    public void setIsFix(Integer isFix) {
        this.isFix = isFix;
    }

    public String getScore() {
        return this.score;
    }
    
    public void setScore(String score) {
        this.score = score;
    }

    public Integer getPnum() {
        return this.pnum;
    }
    
    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public Integer getIsModel() {
        return this.isModel;
    }
    
    public void setIsModel(Integer isModel) {
        this.isModel = isModel;
    }

    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }
   








}