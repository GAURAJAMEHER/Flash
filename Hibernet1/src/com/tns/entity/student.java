package com.tns.entity;

import java.io.Serializable;

//INFORMING TO THE PROGRAM ABOUT THE DATABASE TABLE
@Entity
@Table(name="gauraja")
public class student implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
private int studentid;
private String name;

public int getStudentId() {
	return getStudentId() ;
}	
public void setStudent(int studentId) {
	this.studentid= studentId;
}
public String getName() {
	return name;
}public void setName(String name)	{
this.name=name;
}
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
}