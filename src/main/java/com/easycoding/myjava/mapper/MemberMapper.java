package com.easycoding.myjava.mapper;

import com.easycoding.myjava.entity.member.MemberVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVo> selectMemberList(MemberVo memberVo);
}
