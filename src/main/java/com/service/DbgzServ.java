package com.service;

import com.dao.PendingDocDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Han on 2017/07/14.
 */
@Service
public class DbgzServ {

    @Autowired
    private PendingDocDao pendingDocDao;

    public List<Map<String, Object>> dbList(Integer accountid) {
        List<Map<String, Object>> dbList = new ArrayList<Map<String, Object>>();
        dbList = pendingDocDao.getDocByAccount(accountid);
        return dbList;
    }


    public List<Map<String, Object>> khAccountList(Map<String, Object> map) {
        List<Map<String, Object>> khAccountList = new ArrayList<Map<String, Object>>();

        khAccountList = pendingDocDao.getAccountByDoc(map);

        return khAccountList;
    }
}
