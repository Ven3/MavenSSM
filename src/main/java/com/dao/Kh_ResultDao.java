package com.dao;

import java.util.List;

import com.entity.Kh_Result;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


@Repository
public interface Kh_ResultDao {


	/**
	 * 获得考核结果参数
	 * 
	 * @return
	 */
	public List<Kh_Result> getAll();

	/**
	 * 修改结果参数
	 * 
	 * @param result
	 */
	public void update(Kh_Result result);
}
