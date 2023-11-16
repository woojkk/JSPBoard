package com.example.jspboard.vo;

import lombok.Data;

@Data
public class MemberVO {
  private String memberId;
  private String loginId;
  private String password;
  private String name;
  private String gender;
  private String createdAt;
}
