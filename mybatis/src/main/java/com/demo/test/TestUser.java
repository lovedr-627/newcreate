 package com.demo.test;

import java.io.InputStream;
import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.demo.model.User;
import com.lanqiao.dao.UserDao;


public class TestUser {
     SqlSessionFactory sqlSessionFactory;    
    @Before
	public void setUp() throws Exception {
		//mybatis配置文件
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//使用SqlSessionFactoryBuilder创建sessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void getById() throws SQLException {		
		//获取session
		SqlSession session = sqlSessionFactory.openSession();
		//获取mapper接口的代理对象
	     UserDao Mapper = session.getMapper(UserDao.class);
		//调用代理对象方法
		User user = new User();
		 user = Mapper.getById(1);
			System.out.println(user);
			session.close();
	}      
	@Test
	public void delete() throws SQLException {	
		//获取session
		SqlSession session = sqlSessionFactory.openSession();
		//获取mapper接口的代理对象
	     UserDao Mapper = session.getMapper(UserDao.class);
		//调用代理对象方法
		Mapper.delete(2);
		session.commit();
		session.close();
	}
	@Test
	public void testupdate() throws SQLException {	
		//获取session
		SqlSession session = sqlSessionFactory.openSession();
		//获取mapper接口的代理对象
	     UserDao Mapper = session.getMapper(UserDao.class);
		//调用代理对象方法
		User u = new User();
		u.setUsername("田伯光");
	    u.setPassword("256"); 
	    u.setId(3);
	     Mapper.update(u);;
	     
		//session.commit();
		//session.close();
	}
	
	               


}
