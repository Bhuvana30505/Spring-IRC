package com.example.Educationloanmodel01;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class AdminModel {
	@Id
	private String email;
	  private String Password;
	  private String mobilenumber;
		private String userRole;
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getMobilenumber() {
			return mobilenumber;
		}
		public void setMobilenumber(String mobilenumber) {
			this.mobilenumber = mobilenumber;
		}
		public String getUserRole() {
			return userRole;
		}
		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}
		
}
