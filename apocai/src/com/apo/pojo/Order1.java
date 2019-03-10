package com.apo.pojo;

public class Order1 {
	private int id;
	private String name;
	private String foodName;
	private String foodNumber;
	private String money;
	private String address;
	private String time;
	private String phone;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodNumber() {
		return foodNumber;
	}
	public void setFoodNumber(String foodNumber) {
		this.foodNumber = foodNumber;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Order1 [id=" + id + ", name=" + name + ", foodName=" + foodName + ", foodNumber=" + foodNumber
				+ ", money=" + money + ", address=" + address + ", time=" + time + ", phone=" + phone + ", state="
				+ state + "]";
	}
	
	
}
