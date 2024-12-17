package com.shinhan.daengdong.member.controller;

import com.shinhan.daengdong.member.model.service.GoogleOauthService;
import com.shinhan.daengdong.member.model.service.KakaoOauthService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/oauth")
public class OauthController {

    @Autowired
    KakaoOauthService kakaoOauthService;

    @Autowired
    GoogleOauthService googleOauthService;

    @GetMapping("kakao/code")
    public void getKakaoCode(@RequestParam String code, HttpServletRequest request){
        HttpSession session;

        String accessToken = kakaoOauthService.getToken(code);
    }
}