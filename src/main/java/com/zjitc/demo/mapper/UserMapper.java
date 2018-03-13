package com.zjitc.demo.mapper;

import com.zjitc.demo.pojo.User;

/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/13 14:11
 * @description:
 */
public interface UserMapper {

  /**
   * find user by id
   * @param id
   * @return
   */
  User findById(Integer id);

}
