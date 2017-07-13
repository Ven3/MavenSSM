package com.entity;

@Table("ta_role_right")
public class Ta_Role_RightModel {

	private Integer roleid;
	private Integer rightid;

	public Ta_Role_RightModel() {
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRightid(Integer rightid) {
		this.rightid = rightid;
	}

	public Integer getRightid() {
		return this.rightid;
	}

}