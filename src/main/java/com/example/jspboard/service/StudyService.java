package com.example.jspboard.service;

import com.example.jspboard.dao.StudyDAO;
import com.example.jspboard.vo.StudyVO;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudyService {
  private final StudyDAO studyDAO;

  public StudyService(StudyDAO studyDAO) {
    this.studyDAO = studyDAO;
  }

  public List<StudyVO> doStudyList() {
    return studyDAO.doStudyList();
  }

  public StudyVO doStudy(String strKeyId) {
    return studyDAO.doStudy(strKeyId);
  }

  public int doStudyUp(StudyVO studyVO) {
    return studyDAO.doStudyUp(studyVO);
  }


  public void deleteStudy(String strKeyId) {
    studyDAO.studyDel(strKeyId);
  }

  public void createStudy(StudyVO studyVO) {
    studyDAO.createStudy(studyVO);
  }
}
