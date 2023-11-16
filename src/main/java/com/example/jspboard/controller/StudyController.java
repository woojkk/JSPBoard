package com.example.jspboard.controller;

import com.example.jspboard.service.StudyService;
import com.example.jspboard.vo.StudyVO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/studyReg")
@Slf4j
public class StudyController {

  private final StudyService studyService;

  @GetMapping("")
  public String doStudyReg(Model model) {

    List<StudyVO> list = studyService.doStudyList();

    model.addAttribute("list", list);

    return "/study/studyReg";
  }

  @GetMapping("/insert")
  public String createStudy() {

    return "/study/createStudy";
  }

  @PostMapping("/insert_exe")
  public String createStudyExe(@ModelAttribute StudyVO studyVO) {
    studyService.createStudy(studyVO);

    return "redirect:/studyReg";
  }

  @GetMapping("/modify")
  public String updateStudy(HttpServletRequest request) {
    String strKeyId = request.getParameter("key_id");

    StudyVO studyVO = studyService.doStudy(strKeyId);

    request.setAttribute("studyVO", studyVO);

    return "/study/updateStudy";
  }

  @PostMapping("/modify_exe")
  public String updateStudyExe(@ModelAttribute StudyVO studyVO) {
    studyService.doStudyUp(studyVO);

    return "redirect:/studyReg";
  }

  @GetMapping("/delete")
  public String deleteStudy(@RequestParam(value = "key_id", defaultValue = "--") String strKeyId) {
    studyService.deleteStudy(strKeyId);
    log.info("del");

    return "redirect:/studyReg";
  }
}
