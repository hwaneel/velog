package com.bit.velog.controller;

import com.bit.velog.entity.Member;
import com.bit.velog.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("join") // νμ μΆκ°
    public String join(Member member){
        memberRepository.save(member);
    return "/";
    }
}
