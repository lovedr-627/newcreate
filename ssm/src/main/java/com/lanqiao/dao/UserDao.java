package com.lanqiao.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lanqiao.model.User;

public interface UserDao {
	//List<User> getAll();
	//小脚丫
	List<User> getAll(User user);
	User Login(String username,String password);
	int register(User user);
	User get(int userid);
	int update(User user);
	void delete(int userid);

}
