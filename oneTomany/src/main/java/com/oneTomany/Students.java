package com.oneTomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="student_O2M")

public class Students {
	
	@Id
	@Column(name="roll_No")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "std_roll")
//	@SequenceGenerator(name="std_roll", initialValue=100, allocationSize=1, sequenceName="student_sequence_O2M")
	private int roll_no;
	
	@Column(name="First_Name")
	private String f_name;
	
	@Column(name="Last_Name")
	private String l_name;
	
	@OneToMany(mappedBy="su")
	private List<Laptop>laptop=  new ArrayList<>();
	
	
	
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

	
	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List <Laptop> laptop) {
		this.laptop = laptop;
	}
	
	
}
