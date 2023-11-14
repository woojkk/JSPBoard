package com.example.jspboard.controller;

import com.example.jspboard.service.StudyService;
import com.example.jspboard.vo.StudyVO;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MainController {

  private final StudyService studyService;

  public MainController(StudyService studyService) {
    this.studyService = studyService;
  }

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
  @GetMapping("/studyReg")
  public String doStudy_reg(Model model) {

    List<StudyVO> list = studyService.doStudyList();

    log.info("vo_studey");
    for (StudyVO studyVO : list) {
      log.info(studyVO.getKeyId());
      log.info(studyVO.getStudyDay());
      log.info(studyVO.getContents());
      log.info(studyVO.getRegDay());
    }

    model.addAttribute("list", list);

    return "/studyReg";
  }
}
