package com.relations;

import javax.persistence.*;

@Entity
@Table(name= "student_O2O")
public class Student {
	@Id
	@Column(name="Roll_No")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "std_roll")
	@SequenceGenerator(name="std_roll", initialValue=100, allocationSize=1, sequenceName="student_sequence")
	private int roll_no;
	
	@Column(name="First_Name")
	private String f_name;
	
	@Column(name="Last_Name")
	private String l_name;
	@OneToOne
	private Laptop laptop;
	
	
	
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	
	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	
	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	
	
}
