package com.example.jspboard.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class StudyVO {

  private String keyId;
  private String studyDay;
  private String contents;
  private String regDay;
}