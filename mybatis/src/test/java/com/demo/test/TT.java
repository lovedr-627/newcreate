package com.demo.test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.demo.model.User;
import com.demo.model.UserOrders;
import com.demo.model.vo.UserOrderVo;
import com.lanqiao.dao.UserDao;

public class TT {

	 SqlSessionFactory sqlSessionFactory;
	   
	    @Before
		public void init() {
			//mybatis配置文件
			String resource = "sqlMapConfig.xml";
			InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//使用SqlSessionFactoryBuilder创建sessionFactory
			
		}

		//一对一
		@Test
		public void test() throws SQLException {
			
			//获取session
			SqlSession session = sqlSessionFactory.openSession();
			//获取mapper接口的代理对象
		    UserOrderVo dao = session.getMapper(UserOrderVo.class);
		    //
		    List<UserOrders> list = dao.getUserOrders("zs");
		    for(UserOrders u:list) {
		    	System.out.println(u.getUsername()+"   "+u.getName()+"   "+u.getRegisterTime()+"  "+u.getRtime());
		    }
			 
		}      
		//一对一映射
		@Test
		public void getorders() {
			SqlSession session = sqlSessionFactory.openSession();
			//获取mapper接口的代理对象
		    UserOrderVo dao = session.getMapper(UserOrderVo.class);
		    UserOrders o =  dao.getorders("111");
		  //  List<UserOrders> o = dao.getorders("111");
		    System.out.println(o.getCode()+""+o.getRtime()+" "+o.getUsername()+" "+o.getName()+" "+o.getRegisterTime());
		}
		


	}
