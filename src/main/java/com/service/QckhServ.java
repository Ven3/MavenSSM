package com.service;

import com.dao.AccountDao;
import com.dao.CheckDocDao;
import com.dao.DeptDao;
import com.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Han on 2017/07/14.
 */
@Service
public class QckhServ {


    @Autowired
    private CheckDocDao checkDocDao;

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private DeptDao deptDao;

    public TreeRoot<Account> createSecondManagerTree() {
        // 获得二级经的理部门
        List<Dept> deptlist = this.secondDepList();
        // 创建部门节点
        List<TreeNode> deptNodeList = new ArrayList<TreeNode>();
        // 添加部门节点
        for (int i = 0; i < deptlist.size(); i++) {

            Dept dept = deptlist.get(i);
            TreeNode deptNode = new TreeNode();
            deptNode.setId(dept.getDeptno());
            deptNode.setText(dept.getDeptname());

            // 根据部门编号获得二级经理
            List<Account> accountList = this.secondManagerList(dept
                    .getDeptno());
            // 创建经理节点
            List<TreeNode> accountNodeList = new ArrayList<TreeNode>();
            // 添加经理节点
            for (int j = 0; j < accountList.size(); j++) {
                Account account = accountList.get(j);
                TreeNode accountNode = new TreeNode();
                accountNode.setId(account.getAccountid().toString());
                accountNode.setText(account.getRealname());

                accountNodeList.add(accountNode);
            }

            deptNode.setChildren(accountNodeList);
            deptNodeList.add(deptNode);
        }
        // 将树结构转为Gson
        TreeRoot<Account> tree = new TreeRoot<Account>(deptNodeList);
        return tree;
    }


    private List<Account> secondManagerList(String deptno) {
        return accountDao.getSecond(deptno);
    }

    private List<Dept> secondDepList() {
        List<Dept> list=deptDao.getSecond();
        return  list;
    }

    private List<Account> secondDepList(String deptno) {
        List<Account> list = new ArrayList<Account>();
        list = accountDao.getSecond(deptno);
        return list;
    }
}
