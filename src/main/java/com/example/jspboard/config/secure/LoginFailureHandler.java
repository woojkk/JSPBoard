package com.example.jspboard.config.secure;

import java.io.IOException;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

@Component
public class LoginFailureHandler implements AuthenticationFailureHandler {

  @Override
  public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
      AuthenticationException exception) throws IOException, ServletException {
    System.out.println("--- onAuthenticationFailure ---" + exception.getMessage());

    String errorMessage = exception.getMessage();

    String message = "";

    if (errorMessage == null) {
      message = "입력하신 계정을 찾을 수 없습니다.";
    } else {
      message = exception.getMessage()+ "비밀번호를 확인해 주세요.";
    }

    message = URLEncoder.encode(message, "UTF-8");
    System.out.println("onAuthenticationFailure : " + message);

    String url = "/secure/login?message=";

    response.sendRedirect(url + message);
  }
}
