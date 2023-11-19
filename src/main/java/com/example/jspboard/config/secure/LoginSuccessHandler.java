package com.example.jspboard.config.secure;

import com.example.jspboard.service.MemberService;
import com.example.jspboard.vo.MemberVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

  private final MemberService memberService;

  @Override
  public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
      Authentication authentication) throws IOException, ServletException {
    System.out.println("--- onAuthenticationSuccess ---");

    MemberVO memberVO = memberService.doMemberLogin(authentication.getName());

    HttpSession session = request.getSession();
    session.setAttribute("ss_member_id", memberVO.getMemberId());
    session.setAttribute("ss_login_id", memberVO.getLoginId());
    session.setAttribute("ss_name", memberVO.getName());
    session.setAttribute("ss_gender", memberVO.getGender());
    session.setAttribute("ss_role", memberVO.getRole());

    String url = "/";

    RequestCache requestCache = new HttpSessionRequestCache();
    SavedRequest savedRequest = requestCache.getRequest(request, response);

    if (savedRequest != null) {
      url = savedRequest.getRedirectUrl();
      requestCache.removeRequest(request,response);
    }

    response.sendRedirect(url);
  }
}