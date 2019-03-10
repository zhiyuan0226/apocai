package com.apo.pojo;

public class Turnover {
	private String time;
	private String foodname;
	private int number;
	private int money;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Turnover [time=" + time + ", foodname=" + foodname + ", number=" + number + ", money=" + money + "]";
	}
	
}
