package com.lanqiao.dao;

import java.sql.SQLException;

import com.demo.model.User;

public interface UserDao  {
	
	public User getById(int id) ;
	//第一种用User
	public User login1(User user);
	//删除
	public void delete(int id);
	//修改
	public  void update(User user);

}
