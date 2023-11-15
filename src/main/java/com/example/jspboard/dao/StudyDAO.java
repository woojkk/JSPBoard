package com.example.jspboard.dao;

import com.example.jspboard.vo.StudyVO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudyDAO {
  List<StudyVO> doStudyList();

  StudyVO doStudy(String strKeyId);

  int doStudyUp(StudyVO studyVO);

  void studyDel(String strKeyId);

  void createStudy(StudyVO studyVO);
}
