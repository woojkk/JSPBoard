<%--
헤더 파일
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="p-3 text-bg-dark">
    <div class="container">
        <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"/></svg>
            </a>

            <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                <li><a href="/" class="nav-link px-2 text-secondary">홈</a></li>
                <li><a href="/studyReg" class="nav-link px-2 text-white">공부기록</a></li>
            </ul>

            <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
                <input type="search" class="form-control form-control-dark text-bg-white" placeholder="검색" aria-label="Search">
            </form>

            <div class="text-end">
                <button type="button" class="btn btn-outline-light me-2"
                        onclick="location.href='/login'">로그인</button>
                <button type="button" class="btn btn-warning"
                        onclick="location.href='/signup'">회원가입</button>
            </div>
        </div>
    </div>
</header>