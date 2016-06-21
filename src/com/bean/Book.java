package com.bean;
// default package

import java.sql.Timestamp;
import java.util.Date;


/**
 * Book entity. @author MyEclipse Persistence Tools
 */

public class  Book implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String bookname;
     private Date addDate;//Timestamp
     private Date returnDate;
     private Integer sid;


    // Constructors

    /** default constructor */
    public Book() {
    }

	/** minimal constructor */
    public Book(Integer sid) {
        this.sid = sid;
    }
    
    /** full constructor */
    public Book(String bookname, Date addDate, Date returnDate, Integer sid) {
        this.bookname = bookname;
        this.addDate = addDate;
        this.returnDate = returnDate;
        this.sid = sid;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return this.bookname;
    }
    
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Date getAddDate() {
        return this.addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getReturnDate() {
        return this.returnDate;
    }
    
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getSid() {
        return this.sid;
    }
    
    public void setSid(Integer sid) {
        this.sid = sid;
    }
   








}