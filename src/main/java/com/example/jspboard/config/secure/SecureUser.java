package com.example.jspboard.config.secure;

import com.example.jspboard.service.MemberService;
import com.example.jspboard.vo.MemberVO;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecureUser implements UserDetailsService {

  private final MemberService memberService;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    System.out.println("--- SecureUser >> loaduser By Username ---");

    MemberVO memberVO = memberService.doMemberLogin(username);

    List<GrantedAuthority> authorities = new ArrayList<>();
    authorities.add(new SimpleGrantedAuthority(memberVO.getRole()));

    return new User(memberVO.getLoginId(), "{noop}"+memberVO.getPassword(), authorities);
  }
}
