package com.dao;

import java.util.List;

import com.entity.Dept;
import org.springframework.stereotype.Repository;


@Repository
public interface DeptDao {

	/**
	 * 
	 * 获得二级经理的部门
	 * 
	 * @return
	 */
	public List<Dept> getSecond();

}
