package com.entity;

@Table("ta_account_role")
public class Ta_Account_RoleModel {

	private Integer accountid;
	private Integer roleid;

	public Ta_Account_RoleModel() {
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public Integer getAccountid() {
		return this.accountid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Integer getRoleid() {
		return this.roleid;
	}

}