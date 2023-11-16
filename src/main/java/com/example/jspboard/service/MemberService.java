package com.example.jspboard.service;

import com.example.jspboard.dao.MemberDAO;
import com.example.jspboard.vo.MemberVO;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
  private final MemberDAO memberDAO;

  public MemberService(MemberDAO memberDAO) {
    this.memberDAO = memberDAO;
  }

  public List<MemberVO> doMemberList() {
    return memberDAO.doMemberList();
  }

  public MemberVO doMember(String strMemberId) {
    return memberDAO.doMember(strMemberId);
  }

  public int doMemberUp(MemberVO memberVO) {
    return memberDAO.doMemberUp(memberVO);
  }


  public void deleteMember(String strMemberId) {
    memberDAO.memberDel(strMemberId);
  }

  public void createMember(MemberVO memberVO) {
    memberDAO.createMember(memberVO);
  }

  public MemberVO doMemberLogin(String strLoginId) {
    MemberVO memberVO = memberDAO.doMemberLogin(strLoginId);

    return memberVO;

  }
}
