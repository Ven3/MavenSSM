package com.controller;

import com.entity.Account;
import com.entity.CheckedAccount;
import com.service.DbgzServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**代办工作
 * Created by Han on 2017/07/14.
 */
@Controller
public class DbgzCtrl {

    @Autowired
    private DbgzServ dbgzServ;


    @RequestMapping("/dbgz_dbList")
    public String dbgzList(HttpSession session){
        Account account = (Account) session.getAttribute("Account");
        List<Map<String, Object>> list = dbgzServ.dbList(account.getAccountid());
        session.setAttribute("khlist",list);
        return "file/wdgz_db";
    }


    @RequestMapping("/dbgz_khAccountList")
    public String khAcountList(int docid,HttpSession session){

        // 获取当前用户
        Account account = (Account) session.getAttribute("Account");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("docid", docid);
        map.put("accountid", account.getAccountid());

        // 查询考核文档
        List<Map<String, Object>> list = dbgzServ.khAccountList(map);

        session.setAttribute("list", list);

        return "file/wdgz_db1";
    }

    public String insertKhAccount(Integer[] checkedaccountid){


        return "file/wdgz";
    }
}
