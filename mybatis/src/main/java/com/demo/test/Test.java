 package com.demo.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.demo.model.User;



public class Test {
	public static void main(String[] arge) {
		InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = factory.openSession();
		
		User user = session.selectOne("test.getById",1); 
		
		System.out.println(user.getId()+"   "+user.getUsername());
		
		List<User> list = session.selectList("test.getAll");
		
		for(User u:list) {
			System.out.println(u.getId()+"   "+u.getUsername());
		}
	}

}
