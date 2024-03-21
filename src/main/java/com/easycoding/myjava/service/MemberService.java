package com.easycoding.myjava.service;

import com.easycoding.myjava.mapper.MemberMapper;
import com.easycoding.myjava.entity.member.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberService {

    @Autowired
    public MemberMapper memberMapper;
    public List<MemberVo> selectMemberList(MemberVo memberVo){
        List<MemberVo> memberList = memberMapper.selectMemberList(memberVo);

        return memberList;
    }
}
