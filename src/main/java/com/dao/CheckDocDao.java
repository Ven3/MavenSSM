package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.CheckDoc;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckDocDao {


	/**
	 * 获得所有考核公文
	 * 
	 * @return
	 */
	public List<Map<String, Object>> getAll();

	/**
	 * 插入考核公文
	 * 
	 * @param checkdoc
	 * @return 考核公文ID
	 */
	public int insertForKey(CheckDoc checkdoc);

	/**
	 * 查询所有已考核公文
	 * 
	 * @return
	 */
	public List<Map<String, Object>> getAllChecked();
}
