package com.zjitc.demo.serviceImpl;

import com.zjitc.demo.mapper.UserMapper;
import com.zjitc.demo.pojo.User;
import com.zjitc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/13 14:27
 * @description:
 */
public class UserServiceImpl implements UserService {
  @Autowired
  private UserMapper userMapper;

  /**
   * find user by id
   */
  @Override
  public User findById(Integer id) {
    return userMapper.findById(id);
  }
}
