package com.dao;

import com.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountDao {

    /**
     * 登录
     *
     * @param account
     *            用户名和密码
     * @return 登陆成功则返回用户信息；登录失败则返回null
     */
    public Account login(Account account);

    /**
     * 根据部门编号获得二级经理
     *
     * @return
     */
    public List<Account> getSecond(String deptno);

    /**
     * 根据被考核人的ID，查询所有对其考核的人员ID
     *
     * @param checkedaccountid
     *            根据被考核人的ID
     * @return
     */
    public List<Integer> getIdByCheckedAccount(Integer checkedaccountid);
}
