package com.jpa_staff;


import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)

public class Staff{
	

	@Id
	private int sid;
	
	@Column(name="staff_name")
	private String sname;
	
	
	public Staff( int sid, String sname ) {
	      super( );
	      this.sid = sid;
	      this.sname = sname;
	   }
	   
	   public Staff( ) {
	      super( );
	   }

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	
	
	
}
