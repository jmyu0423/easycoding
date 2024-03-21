package com.easycoding.myjava.controller;

import com.easycoding.myjava.entity.member.MemberVo;
import com.easycoding.myjava.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping(value="/selectMemberList")
    public List<MemberVo> selectMemberList(MemberVo memberVo, HttpServletRequest request) throws Exception {
        List<MemberVo> memberList = memberService.selectMemberList(memberVo);

        return memberList;
    }
}
