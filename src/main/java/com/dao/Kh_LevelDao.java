package com.dao;

import java.util.List;

import com.entity.Kh_Level;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


@Repository
public interface Kh_LevelDao  {


	/**
	 * 获得考核级别参数
	 * 
	 * @return
	 */
	public List<Kh_Level> getAll();
	/**
	 * 修改级别参数
	 * 
	 * @param level
	 */
	public void update(Kh_Level level);

}
