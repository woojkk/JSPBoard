<%@ page import="java.util.List" %>
<%@ page import="com.example.jspboard.vo.StudyVO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  List<StudyVO> list = (List<StudyVO>) request.getAttribute("list");
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

<body>

<div class="b-example-divider"></div>

<!-- 헤더 -->
<%@ include file="/WEB-INF/views/comm/header.jsp"%>
<br>

<main>
  <div class="container text-center">
    <div class="row nb-2">
      <div class="col">No</div>
      <div class="col">공부일자</div>
      <div class="col">공부내용</div>
      <div class="col">등록일자</div>
    </div>

    <% for (StudyVO vo : list) { %>
    <div class="row nb-2">
      <div class="col"><%=vo.getKeyId()%></div>
      <div class="col"><%=vo.getStudyDay()%></div>
      <div class="col"><%=vo.getContents()%></div>
      <div class="col"><%=vo.getRegDay()%></div>
    </div>
    <% } %>
  </div>
</main>

<!-- 푸터 -->
<%@ include file="/WEB-INF/views/comm/footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>