package com.entity;

@Table("dept")
public class DeptModel {

	private String deptno;
	private String deptname;
	private String descript;

	public DeptModel() {
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getDeptno() {
		return this.deptno;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getDescript() {
		return this.descript;
	}

}