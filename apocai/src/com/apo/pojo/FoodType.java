package com.apo.pojo;

import java.util.List;

public class FoodType {
	private int id;
	private String typename;
	private List<Food> list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public List<Food> getList() {
		return list;
	}
	public void setList(List<Food> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "FoodType [id=" + id + ", typename=" + typename + ", list=" + list + "]";
	}
	
	
}
