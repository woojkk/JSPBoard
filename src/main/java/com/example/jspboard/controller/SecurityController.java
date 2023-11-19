package com.example.jspboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secure")
public class SecurityController {

  @GetMapping("/login")
  public String SecureLogin(@RequestParam(value = "message", defaultValue = "default", required = false)
  String message, Model model) {
    System.out.println("doSecureLogin : " + message);
    model.addAttribute("message", message);

    return "/secure/loginSecure";
  }
}
