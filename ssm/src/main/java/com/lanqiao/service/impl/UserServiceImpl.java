package com.lanqiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanqiao.dao.UserDao;
import com.lanqiao.model.User;
import com.lanqiao.service.UserService;
@Service
public class UserServiceImpl implements UserService{
    @Autowired  
	private UserDao userdao;
	
	@Override
	public User Login(String username, String password) {
		// TODO Auto-generated method stub
		return userdao.Login(username, password);
	}
	
	/*@Override
	public PageInfo<User> getpage(int pageno, int pagesize ) {
		PageHelper.startPage(pageno, pagesize);
		   List<User> list = userdao.getAll();
		   PageInfo<User> page = new PageInfo<User>(list);
		return page;
	}*/

	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return userdao.register(user);
	}

	@Override
	public User get(int userid) {
		// TODO Auto-generated method stub
		return userdao.get(userid);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return userdao.update(user);
	}

	@Override
	public void delete(int userid) {
		// TODO Auto-generated method stub
		userdao.delete(userid);
	}

	@Override
	public PageInfo<User> getpage(int pageno, int pagesize, User user) {
		PageHelper.startPage(pageno, pagesize);
		   List<User> list = userdao.getAll(user);
		   PageInfo<User> page = new PageInfo<User>(list);
		return page;
	}

	

	
	
	
	
}
