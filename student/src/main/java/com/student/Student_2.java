package com.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;





@Entity
@Table(name = "Student_2")
public class Student_2 {
	
	@Id
	@Column(name ="roll_no")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "std_id" )
	@SequenceGenerator(name= "std_id", initialValue=100,allocationSize=1,sequenceName="std_sequence")
	private int roll_no;
	
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	@Column(name ="First_Name")
	private String fname;
	
	@Column(name = "Last_Name")
	private String lname;
	
	@Column(name = "Class")
	private String std;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}
	

	
	
}