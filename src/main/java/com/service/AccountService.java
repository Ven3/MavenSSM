package com.service;

import com.dao.AccountDao;
import com.entity.account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Han on 2017/07/13.
 */
@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public account login(account account) {
        account account1 = accountDao.login(account);
        return account1;
    }
}
