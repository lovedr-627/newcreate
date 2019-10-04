package com.demo.model.vo;

import java.sql.SQLException;
import java.util.List;

import com.demo.model.UserOrders;

public interface UserOrderVo {
	public List<UserOrders>  getUserOrders(String username) throws SQLException;
    public UserOrders  getorders(String code);
}
