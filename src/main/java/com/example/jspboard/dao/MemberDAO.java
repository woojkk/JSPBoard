package com.example.jspboard.dao;

import com.example.jspboard.vo.MemberVO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDAO {
  List<MemberVO> doMemberList();

  MemberVO doMember(String strMemberId);

  int doMemberUp(MemberVO memberVO);

  void memberDel(String strMemberId);

  void createMember(MemberVO memberVO);

  MemberVO doMemberLogin(String strLoginId);
}
