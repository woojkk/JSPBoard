package com.example.jspboard.dao;

import com.example.jspboard.vo.StudyVO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudyDAO {
  List<StudyVO> doStudyList();
}
