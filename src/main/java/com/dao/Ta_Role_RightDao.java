package com.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


@Repository
public interface Ta_Role_RightDao {


	/**
	 * 修改权限（删除）
	 */
	public void delete();

	/**
	 * 修改权限（插入）
	 * 
	 * @param map
	 *            包含roleid、rightid
	 */
	public void insert(Map<String, Object> map);

}
