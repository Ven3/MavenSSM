package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.PendingDoc;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


/**
 * 待办公文DAO
 * 
 * @author Administrator
 * 
 */
@Repository
public interface PendingDocDao {


	/**
	 * 插入待办公文
	 * 
	 * @param pendingdoc
	 */
	public void insert(PendingDoc pendingdoc);

	/**
	 * 获取当前用户的待办公文
	 * 
	 * @param accountid
	 *            当前用户的ID
	 * @return
	 */
	public List<Map<String, Object>> getDocByAccount(Integer accountid);

	/**
	 * 根据公文ID获得所有被考核人
	 * 
	 * @param map
	 *            参数MAP，包含公文ID和当前用户ID
	 * @return
	 */
	public List<Map<String, Object>> getAccountByDoc(Map<String, Object> map);

	/**
	 * 修改待办公文的状态为已办
	 * 
	 * @param pendingdoc
	 */
	public void updateState(PendingDoc pendingdoc);

}
