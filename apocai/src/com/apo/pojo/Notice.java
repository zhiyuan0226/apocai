package com.apo.pojo;

public class Notice {
	/**
	 * id 标题 内容 创建时间 修改时间
	 */
	private int id;
	private String title;
	private String inform;
	private String createTime;
	private String updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInform() {
		return inform;
	}
	public void setInform(String inform) {
		this.inform = inform;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", inform=" + inform + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}

	
}
