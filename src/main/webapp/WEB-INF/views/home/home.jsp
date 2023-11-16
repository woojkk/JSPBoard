<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Hello</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>

<!-- 헤더 -->
<%@ include file="/WEB-INF/views/comm/header.jsp"%>

<main>
  <div class="px-4 py-2 my-2 text-center">
    <div class="col-lg-6 mx-auto">
      프로젝트 소개 : 공부기록을 남기는 게시판 프로젝트입니다.<br><br>
      언어: Java 1.8<br>
      개발툴 : IntelliJ<br>
      RDBMS : Oracle<br>
      View  : JSP<br>
      Mapper : Mybatis
    </div>
  </div>
</main>

<!-- 푸터 -->
<%@ include file="/WEB-INF/views/comm/footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>