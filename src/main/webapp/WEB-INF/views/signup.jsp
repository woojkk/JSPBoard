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
<body class="text-center">

<div class="b-example-divider"></div>

<!-- 헤더 -->
<%@ include file="/WEB-INF/views/comm/header.jsp"%>

<div class="b-example-divider"></div>

<main class="form-signin w-100 m-auto">
  <form>
    <h1 class="h3 mb-3 fw-normal">회원가입</h1>

    <div class="form-floating">
      <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">이메일</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
      <label for="floatingPassword">비밀번호</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingName" placeholder="Name">
      <label for="floatingPassword">이름</label>
    </div>
    </div>
    <div class="btn btn-group" data-toggle="buttons">
      <label class="btn btn-primary active">
        <input type="radio" name="form-control" autocapitalize="off" value="남자" checked>남자
      </label>
      <label class="btn btn-primary">
        <input type="radio" name="form-control" autocapitalize="off" value="여자" checked>여자
      </label>
    </div>


    <div class="form-check text-start my-3">
      <input class="form-check-input" type="checkbox" value="remember-me" id="flexCheckDefault">
      <label class="form-check-label" for="flexCheckDefault">
        Remember me
      </label>
    </div>
    <button class="btn btn-primary w-100 py-2" type="submit">회원가입</button>
    <p class="mt-5 mb-3 text-body-secondary">&copy; 2023–2023</p>
  </form>
</main>

<!-- 푸터 -->
<%@ include file="/WEB-INF/views/comm/footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>