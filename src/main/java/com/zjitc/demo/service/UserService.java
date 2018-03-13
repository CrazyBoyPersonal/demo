package com.zjitc.demo.service;

import com.zjitc.demo.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/13 15:29
 * @description:
 */

@Service
public interface UserService {

  /**
   * find user by id
   * @param id
   * @return
   */
  User findById(Integer id);
}
