package com.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="studentid")
	private int studentid;
	@Column(name="studentname")
	private String studentname;
	@Column(name="studentaddress")
	private String studentaddress;
	@Column(name="Branch")
	private String Branch;
	public Student()
	{
		
	}
	public Student(int studentid, String studentname, String studentaddress, String Branch) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentaddress = studentaddress;
		this.Branch = Branch;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String Branch) {
		this.Branch = Branch;
	}
	

}
