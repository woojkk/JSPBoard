package com.example.jspboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String doHome(HttpServletRequest request, Model model) {
    String role = "";
    String auth = "N";

    HttpSession session = request.getSession();

    if (session != null) {
      role = (String) session.getAttribute("ss_role");
    }

    if (role != null && role.equals("ADMIN")) {
      auth = "Y";
    }

    System.out.println("strAuth : " + auth);
    model.addAttribute("ss_auth", auth);

    return "/home/home";
  }
}

