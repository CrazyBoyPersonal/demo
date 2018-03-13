package com.zjitc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by IntelliJ IDEA
 *
 * @author: jsonor
 * @date-Time: 2018/3/13 15:34
 * @description:
 */

@Controller
public class UserController {

  @RequestMapping("/index.do")
  public String index() {
    System.out.println("hello world!");
    return null;
  }
}
