package com.example.jspboard.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {
  /*
  private final BootInterceptor bootInterceptor;
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    //registry.addInterceptor(new BootInterceptor())
    registry.addInterceptor(bootInterceptor)
        .addPathPatterns("/**") // 적용할 URL (모든 URL )
        .excludePathPatterns("/","/member/insert", "/js/**", "/css/**", "/docs/**", "/home/**"); // 해당 경로는 인터셉터가 가로채지 않는다.
  }
   */
}
