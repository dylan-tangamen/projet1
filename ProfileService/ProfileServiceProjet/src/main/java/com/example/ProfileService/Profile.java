package com.example.ProfileService;

import javax.validation.constraints.NotNull;

public class Profile {

	
	private long id;
	
	@NotNull
	private String name;
	private String email;
	private String description;
	
	// description, email, ...
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Profile(long id, String name, String email, String description) {
		this.id=id;
		this.name = name;
		this.email = email;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
