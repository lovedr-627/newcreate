package com.lanqiao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.lanqiao.model.User;
import com.lanqiao.service.UserService;

@Controller
public class MyController {
	@Autowired
	private UserService uservice;
	/*@RequestMapping("getAll.action")
	     public ModelAndView getAll(@RequestParam(required=false,defaultValue="1") int pageno,
	    		                    @RequestParam(required=false,defaultValue="3") int pagesize) {
	    	 ModelAndView mv = new ModelAndView();
	    	 PageInfo<User> page  = uservice.getpage(pageno, pagesize);
	    	 mv.addObject("page",page);
	    	 mv.setViewName("userlist");
	    	 
			return mv;
	    	 
	     }*/
	@RequestMapping("login.action")
	public String login() {
		return "index";
	}
	@RequestMapping("dologin.action")
	   public String Login(String username,String password) {
		User user = uservice.Login(username, password);
		if(user==null) {
			return "error";
		}		
		return "forward:getAll.action";   
	   }
	@RequestMapping("register.action")
	public String register() {
		return "register";
	}
	@RequestMapping("doregister.action")
	public String register(User user) {
		int rs = uservice.register(user);
		if(rs>0) {
			return "index";
		}
		
		return "error";
		
	}
	@RequestMapping("edit.action")
	
		public ModelAndView getAl(int userid) {
         ModelAndView mv = new ModelAndView();
          User user = uservice.get(userid);
              mv.addObject("user",user);
               mv.setViewName("modifi");

                  return mv;
}
	@RequestMapping("conform.action")
	public String upd(User user) {
		int rs = uservice.update(user);
		return "forward:search.action";
		
	}
	@RequestMapping("delete.action")
	public String dele(int userid) {
	 uservice.delete(userid);
		return "forward:search.action";
	}
	
	@RequestMapping("search.action")
    public ModelAndView getAll(@RequestParam(required=false,defaultValue="1") int pageno,
   		                    @RequestParam(required=false,defaultValue="3") int pagesize,
   		                    String val,String type) {
   	 ModelAndView mv = new ModelAndView();
   	 User u = new User();
   	 if("username".equals(type)) {
   		 u.setUsername(val);
   	 }
   	 if("birthday".equals(type)) {
   		 u.setBirthday(val);
   	 }
   	 PageInfo<User> page  = uservice.getpage(pageno, pagesize,u);
   	 mv.addObject("page",page);
   	 mv.setViewName("userlist");
   	 
		return mv;
   	 
    }
	
	
}

