package com.shinhan.daengdong.member.model.service;

import com.shinhan.daengdong.member.dto.MemberDTO;

public interface MemberServiceInterface {

    MemberDTO login(String email);

    MemberDTO signUp(MemberDTO kakaoMember);
}
