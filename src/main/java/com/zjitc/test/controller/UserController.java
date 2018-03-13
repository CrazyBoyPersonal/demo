package com.zjitc.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Create with IntelliJ IDEA
 * User : kevin
 * Dare : 2018/3/13
 * Time : 12:21
 * To change this template use File | Setting | File Template.
 * Description :
 */

@Controller
public class UserController {

  @RequestMapping("/login")
  public String login(HttpServletRequest request) {
    System.out.println("login request success!");
    return null;
  }
}
