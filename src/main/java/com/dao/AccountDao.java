package com.dao;

import com.entity.account;
import org.springframework.stereotype.Repository;

/**
 * Created by Han on 2017/07/13.
 */
@Repository
public interface AccountDao {

    public account login(account account);
}
