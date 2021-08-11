package com.jpa_staff;

import javax.persistence.*;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue( value = "NS" )
@PrimaryKeyJoinColumn(referencedColumnName="sid")

public class NonTeachingStaff extends Staff{
	private String areaexpertise;
	
	
	public NonTeachingStaff( int sid, String sname, String areaexpertise ) {
	      super( sid, sname );
	      this.areaexpertise = areaexpertise;
	}

	public NonTeachingStaff( ) {
	   super( );
	}

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}

}
