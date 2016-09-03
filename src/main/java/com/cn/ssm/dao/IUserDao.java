package com.cn.ssm.dao;

import java.util.HashMap;

import com.cn.ssm.pojo.User;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);
    
    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    User selectUser(String userid,String pwd);

    HashMap<String,Object> selectUserHome(String userid);
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}