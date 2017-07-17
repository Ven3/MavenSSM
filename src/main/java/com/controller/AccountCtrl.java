package com.controller;

import com.entity.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.SessionScope;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Han on 2017/07/13.
 */
@Controller
public class AccountCtrl {

    @Autowired
    private AccountService accountService;

    @PostMapping("/login")
    public String getUser(Account Account, HttpSession session){

        Account loginAccount =accountService.login(Account);

        if(loginAccount !=null){
          session.setAttribute ("Account",loginAccount);

            return "redirect:file/wdgz";
        }

        return "login";

    }
}
