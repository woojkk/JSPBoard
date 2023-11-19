<%--
헤더 파일
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String loginId = "guest";
    String name = "guest";
    String gender = "";
    String role = "";

    String loginLogout = "";
    String url = "";

    session = request.getSession(false);

    if (session != null) {
      loginId = (String) session.getAttribute("ss_login_id");
      name = (String) session.getAttribute("ss_name");
      gender = (String) session.getAttribute("ss_gender");
      role = (String) session.getAttribute("ss_role");
      loginLogout = "로그아웃";
      url = "/logout";
    }

    if (loginId == null) {
      loginId = "guest";
      name = "guest";
      loginLogout = "로그인";
      url = "/secure/login";
    }

    String auth = (String) request.getAttribute("ss_auth");

    if (auth == null) {
      auth = "N";
    }
%>
<header class="p-3 text-bg-dark">
    <div class="container">
        <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"/></svg>
            </a>

            <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                <li><a href="/" class="nav-link px-2 text-secondary">홈</a></li>
                <li><a href="/studyReg" class="nav-link px-2 text-white">공부기록</a></li>
                <%
                    if (auth.equals("Y")) {
                %>
                <li><a href="/member/list" class="nav-link px-2 text-white">회원목록</a></li>
                <%
                    }
                %>
            </ul>

            <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
                <input type="search" class="form-control form-control-dark text-bg-white" placeholder="검색" aria-label="Search">
            </form>

            <div class="text-end">
                <button type="button" class="btn btn-outline-light me-2"
                        onclick="location.href='<%=url%>'"><%=loginLogout%></button>
                <%
                    if (loginId.equals("guest")) {
                %>
                <button type="button" class="btn btn-warning"
                        onclick="location.href='/member/insert'">회원가입</button>
                <%
                    }
                %>
            </div>
        </div>
    </div>
</header>