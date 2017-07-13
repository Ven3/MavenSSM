package com.entity;

@Table("tb_right")
public class Tb_RightModel {

	private Integer rightid;
	private String rigthname;
	private String url;
	private String descript;

	public Tb_RightModel() {
	}

	public void setRightid(Integer rightid) {
		this.rightid = rightid;
	}

	public Integer getRightid() {
		return this.rightid;
	}

	public void setRigthname(String rigthname) {
		this.rigthname = rigthname;
	}

	public String getRigthname() {
		return this.rigthname;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getDescript() {
		return this.descript;
	}

}