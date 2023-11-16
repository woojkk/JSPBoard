package com.example.jspboard.controller;

import com.example.jspboard.service.MemberService;
import com.example.jspboard.vo.MemberVO;
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
@RequestMapping("/member")
@Slf4j
public class MemberController {

  private final MemberService memberService;

  @GetMapping("/list")
  public String doMemberList(Model model) {

    List<MemberVO> list = memberService.doMemberList();

    model.addAttribute("list", list);

    return "/member/memberList";
  }

  @GetMapping("/insert")
  public String createMember() {

    return "/member/createMember";
  }

  @PostMapping("/insert_exe")
  public String createMemberExe(@ModelAttribute MemberVO memberVO) {
    memberService.createMember(memberVO);

    return "redirect:/";
  }

  @GetMapping("/modify")
  public String updateMember(HttpServletRequest request) {
    String strMemberId = request.getParameter("key_id");

    MemberVO memberVO = memberService.doMember(strMemberId);

    request.setAttribute("studyVO", memberVO);

    return "/member/updateMember";
  }

  @PostMapping("/modify_exe")
  public String updateMemberExe(@ModelAttribute MemberVO memberVO) {
    memberService.doMemberUp(memberVO);

    return "redirect:/memberReg";
  }

  @GetMapping("/delete")
  public String deleteMember(@RequestParam(value = "key_id", defaultValue = "--") String strMemberId) {
    memberService.deleteMember(strMemberId);

    return "redirect:/member/list";
  }
}
