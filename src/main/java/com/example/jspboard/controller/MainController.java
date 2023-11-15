package com.example.jspboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String doHome() {
    return "/home";
  }

  @GetMapping("/signup")
  public String doSignup() {
    return "/signup";
  }

  @GetMapping("/login")
  public String doLogin() {
    return "/login";
  }
}
