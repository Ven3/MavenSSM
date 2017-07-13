package com.controller;

import com.entity.account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Han on 2017/07/13.
 */
@Controller
public class UserController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/login")
    public String getUser(account account, HttpSession session){

        account account1 =accountService.login(account);

        session.setAttribute("account",account1);
        return "file/wdgz";
    }
}
