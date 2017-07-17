package com.controller;

import com.entity.Account;
import com.entity.TreeRoot;
import com.service.QckhServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**起草考核
 * Created by Han on 2017/07/14.
 */




@Controller
public class QckhCtrl {



    @Autowired
    private QckhServ qckhServ;

    @RequestMapping("/qckh_khList")
    public String newCheck(){
        return "file/wdgz_qckh";
    }

    @RequestMapping("/qckh_getManagers")
    @ResponseBody
    public TreeRoot<Account> getManagers(){

        TreeRoot<Account> manager = qckhServ.createSecondManagerTree();
        return manager;
    }

    @PostMapping("/qckh_khInsert")
    public String qckh_khInsert(){

        return  "redirect:file/wdgz";
    }
}
