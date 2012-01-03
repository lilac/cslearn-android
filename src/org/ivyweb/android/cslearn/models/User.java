package org.ivyweb.android.cslearn.models;

import com.j256.ormlite.field.DatabaseField;

public class User {

	
	@DatabaseField(generatedId = true)
	int id;
	@DatabaseField(index = true, unique = true)
	String email;
	
	@DatabaseField
	String passwd;
	
	public User(String email, String passwd) {
		super();
		this.email = email;
		this.passwd = passwd;
	}
	
	public User() {
		super();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getId() {
		return id;
	}

}
