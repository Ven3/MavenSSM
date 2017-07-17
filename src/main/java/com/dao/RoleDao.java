package com.dao;

import java.util.List;

import com.entity.Role;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleDao {



	/**
	 * 查询所有角色
	 * 
	 * @return
	 */
	public List<Role> getAll();

}
