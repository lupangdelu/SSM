package com.cn.ssm.service;

import com.cn.ssm.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	public int insert(String name);
	public int login(String userid,String pwd);
	public int logout(String userid);
}
 