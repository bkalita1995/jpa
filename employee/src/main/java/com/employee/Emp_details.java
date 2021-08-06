package com.employee;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Emp_details {
	
	@Column(name = "First_Name")
	private String f_name;
	
	@Column(name = "Last_Name")
	private String l_name;
	
	@Column(name = "Middle_Name")
	private String m_name;
	
//	@Column(name = "Address")
//	private String Address;

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

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	

//	public String getAddress() {
//		return Address;
//	}
//
//	public void setAddress(String address) {
//		Address = address;
	
	@Override
	public String toString() {
		return "Emp_details [f_name=" + f_name + ", l_name=" + l_name + ", m_name=" + m_name + "]";
	}
	
	
	

}
