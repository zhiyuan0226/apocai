package com.apo.pojo;

public class Food {
	// 食物id
	private int id;
	// 类型id
	private int tid;
	// 食物名称
	private String foodname;
	// 原料
	private String material;
	// VIP价格
	private double vipPrice;
	// 市场价格
	private double marketPrice;
	// 解释
	private String explain1;
	// 食物图片
	private String foodImg;
	// 食物类别
	private FoodType foodType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getVipPrice() {
		return vipPrice;
	}
	public void setVipPrice(double vipPrice) {
		this.vipPrice = vipPrice;
	}
	public double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}
	public String getExplain1() {
		return explain1;
	}
	public void setExplain1(String explain1) {
		this.explain1 = explain1;
	}
	public String getFoodImg() {
		return foodImg;
	}
	public void setFoodImg(String foodImg) {
		this.foodImg = foodImg;
	}
	public FoodType getFoodType() {
		return foodType;
	}
	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", tid=" + tid + ", foodname=" + foodname + ", material=" + material + ", vipPrice="
				+ vipPrice + ", marketPrice=" + marketPrice + ", explain1=" + explain1 + ", foodImg=" + foodImg
				+ ", foodType=" + foodType + "]";
	}
	
	
}
