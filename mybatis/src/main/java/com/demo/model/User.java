 package com.demo.model;

import java.util.List;

public class User  {
	private int id;
	private String username;
	private String password;
	private int sex;
	private String birthday;
	
	private List<UserOrders> userorders;
	
	public List<UserOrders> getUserorders() {
		return userorders;
	}
	public void setUserorders(List<UserOrders> userorders) {
		this.userorders = userorders;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
    

}
