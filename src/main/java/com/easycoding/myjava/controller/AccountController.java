package com.easycoding.myjava.controller;

import com.easycoding.myjava.common.json.JsonResult;
import com.easycoding.myjava.entity.board.AccountVo;
import com.easycoding.myjava.service.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value="/createAccount")
    public JsonResult createAccount(@RequestBody AccountVo accountVo, HttpServletRequest request) throws Exception{
        return accountService.createAccount(accountVo, request);
    }
}
