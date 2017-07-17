package com.dao;

import java.util.List;

import com.entity.Kh_SmallItem;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


@Repository
public interface Kh_SmallItemDao {


	/**
	 * 获得所有考核项目对应分数
	 * 
	 * @return
	 */
	public List<Kh_SmallItem> getAll();

	/**
	 * 修改考核各项目对应分数
	 * 
	 * @param item
	 */
	public void update(Kh_SmallItem item);
}
