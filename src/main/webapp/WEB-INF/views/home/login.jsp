<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  String strMessage = (String) request.getAttribute("message");
  if(strMessage==null){ strMessage = "ID와 비밀번호를 입력해 주세요"; }
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
<body class="text-center">

<div class="b-example-divider"></div>

<!-- 헤더 -->
<%@ include file="/WEB-INF/views/comm/header.jsp"%>

<div class="b-example-divider"></div>

<main class="form-signin w-100 m-auto">
  <form>
    <h1 class="h3 mb-3 fw-normal">로그인</h1>

    <div><label><%=strMessage%></label></div>
    <div class="form-floating">
      <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">아이디</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
      <label for="floatingPassword">비밀번호</label>
    </div>

    <button class="btn btn-primary w-100 py-2" type="submit">로그인</button>
    <p class="mt-5 mb-3 text-body-secondary">&copy; 2023–2023</p>
  </form>
</main>

<!-- 푸터 -->
<%@ include file="/WEB-INF/views/comm/footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>