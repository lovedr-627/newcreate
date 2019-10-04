package com.lanqiao.service;

import java.util.List;

//mkl
import com.github.pagehelper.PageInfo;
import com.lanqiao.model.User;

public interface UserService {
	//helloword
	//这是一个神话
	///kas;fa[oifn
	PageInfo<User> getpage(int pageno,int pagesize,User user) ;
	User Login(String username,String password);
	int register(User user);
	User get(int userid);
	int update(User user);
	void delete(int userid);
}
