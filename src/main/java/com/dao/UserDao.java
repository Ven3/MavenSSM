package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Han on 2017/07/13.
 */
@Repository
public interface UserDao {

//    @Select("Select * from user where userid=#{userid}")
    public User getUser(int userid);

}
