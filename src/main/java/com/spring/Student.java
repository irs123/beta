package com.spring;

import javax.validation.constraints.Size;

public class Student {
			@Size(min = 3, max = 10)
			private String fname;
			private String lname;
			private String location;
			
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
			public String getLocation() {
				return location;
			}
			public void setLocation(String location) {
				this.location = location;
			}
			
}
