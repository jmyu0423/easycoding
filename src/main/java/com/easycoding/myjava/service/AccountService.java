package com.easycoding.myjava.service;

import com.easycoding.myjava.common.json.JsonResult;
import com.easycoding.myjava.entity.board.AccountVo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    public MessageSourceAccessor messageSourceAccessor;

    public JsonResult createAccount(AccountVo accountVo, HttpServletRequest request) throws Exception{
        System.out.println("=====createAccount 테스트=====");
        return null;
    }
}
