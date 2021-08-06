package com.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Emp_Id {
	
	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="emp_id")
	@SequenceGenerator(name= "emp_id", initialValue=100, allocationSize=1, sequenceName="emp_sequence")
	
	private int emp_id;
	private Emp_details emp_name;
	private String dept_name;
	
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public Emp_details getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(Emp_details emp_name) {
		this.emp_name = emp_name;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	
	@Override
	public String toString() {
		return "Emp_Id [emp_id=" + emp_id + ", emp_name=" + emp_name + ", dept_name=" + dept_name + "]";
	}
	
	
	
	
	

}
