<%@ page contentType="text/html;charset=UTF-8" language="java" %>


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

<div class="b-example-divider"></div>

<main class="form-signin w-100 m-auto">
  <form name="createMemberForm" action="/member/insert_exe" method="post">
    <h1 class="h3 mb-3 fw-normal">회원가입</h1>

    <div class="form-floating">
      <input type="text" class="form-control" name="loginId" id="floatingId" placeholder="아이디">
      <label for="floatingId">아이디</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" name="password" id="floatingPassword" placeholder="Password">
      <label for="floatingPassword">비밀번호</label>
    </div>
    <div class="form-floating">
      <input type="text" class="form-control" name="name" id="floatingName" placeholder="이름">
      <label for="floatingName">이름</label>
    </div>
    <div class="btn btn-group" data-toggle="buttons">
      <label class="btn btn-primary active">
        <input type="radio" name="gender" autocapitalize="off" value="남자" checked>남자
      </label>
      <label class="btn btn-primary">
        <input type="radio" name="gender" autocapitalize="off" value="여자" checked>여자
      </label>
    </div>
    <div><label>권한</label> <input type="radio" name="role" value="MEMBER">MEMBER
      <input type="radio" name="role" value="ADMIN">ADMIN</div>
    <br>

    <button class="w-100 btn btn-lg btn-primary py-2" type="submit">회원가입</button>
  </form>
</main>

<!-- 푸터 -->
<%@ include file="/WEB-INF/views/comm/footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>