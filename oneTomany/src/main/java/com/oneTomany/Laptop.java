package com.oneTomany;

import javax.persistence.*;

@Entity
@Table(name ="laptop_O2M")

public class Laptop {

	@Id
	@Column(name="l_Id")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="laptop_id")
//	@SequenceGenerator(name="laptop_id", initialValue=550, allocationSize=4, sequenceName="laptop_sequence_O2M")
	private int l_id;
	
	@Column(name="Laptop_Model")
	private String l_model;
	
	@ManyToOne
	private Students su;
	
	public Students getSu() {
		return su;
	}

	public void setSu(Students su) {
		this.su = su;
	}

	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public String getL_model() {
		return l_model;
	}

	public void setL_model(String l_model) {
		this.l_model = l_model;
	}
}