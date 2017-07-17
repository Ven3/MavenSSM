package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.CheckedAccount;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


@Repository
public interface CheckedAccountDao  {


	/**
	 * 插入考核表
	 * 
	 * @param checkedaccount
	 */
	public void insert(CheckedAccount checkedaccount) ;

	/**
	 * 根据考核公文ID获得所有考核人ID，用于插入待办公文表
	 * 
	 * @param docid
	 *            考核公文ID
	 * @return 考核人ID
	 */
	public List<Integer> getAccounByDoc(Integer docid) ;

	/**
	 * 更新考核表，修改评分
	 * 
	 * @param checkedaccount
	 */
	public void updateForKh(CheckedAccount checkedaccount) ;

	/**
	 * 查询考核结果（分级别）
	 * 
	 * @param map
	 *            参数。包括考核公文ID（docid），考核结果参数映射（kh_result表中的EXCELLENT、GOOD、
	 *            EMPLOYABLE、
	 *            BASICEMPLOYABLE、UNEMPLOYABLE五项对应的系数），考核级别（khLevel，其值应该为
	 *            'SUPERIORS'、'PEER'、'INFERIOR'中的一个）
	 * @return
	 */
	public List<Map<String, Object>> getResult(Map<String, Object> map);
}
