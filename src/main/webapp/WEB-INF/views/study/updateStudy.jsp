<%@ page import="com.example.jspboard.vo.StudyVO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  StudyVO studyVO = (StudyVO) request.getAttribute("studyVO");
%>

<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Hello</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <link rel="stylesheet" href="/css/sign-in.css">
</head>
<body class="text-center"></body>

<body>

<div class="b-example-divider"></div>

<!-- 헤더 -->
<%@ include file="/WEB-INF/views/comm/header.jsp"%>
<br>

<main>
  <form name="updateStudyForm" action="/studyReg/modify_exe" method="post">
    <div>No : <input type="text" name="keyId" value="<%=studyVO.getKeyId()%>" readonly></div>
    <br>
    <div>공부 일자 : <input type="text" name="studyDay" value="<%=studyVO.getStudyDay()%>"></div>
    <br>
    <div>내용 : <input type="text" name="contents" value="<%=studyVO.getContents()%>" size="70"></div>
    <br>

    <input type="submit" value="수정하기">
  </form>
</main>

<!-- 푸터 -->
<%@ include file="/WEB-INF/views/comm/footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>