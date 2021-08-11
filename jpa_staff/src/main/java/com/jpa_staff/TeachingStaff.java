package com.jpa_staff;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName ="sid")

public class TeachingStaff extends Staff{
	
		private String qualification;
		private String subject;
		
		
		public TeachingStaff( int sid, String sname, String qualification,String subject ) {
			
		super( sid, sname );
			this.qualification = qualification;
			this.subject = subject;
		}

		public TeachingStaff( ) {
				super( );
		}
		
		
		
		
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
}
