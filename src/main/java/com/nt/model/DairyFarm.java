package com.nt.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="DairyFarm")
public class DairyFarm {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productid;
	private String productname;
	private BigDecimal price;
	private String imageUrl;
	private String energy;
	private String fat;
	private String protien;
	private String nuriationalinfo;
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getEnergy() {
		return energy;
	}
	public void setEnergy(String energy) {
		this.energy = energy;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	public String getProtien() {
		return protien;
	}
	public void setProtien(String protien) {
		this.protien = protien;
	}
	public String getNuriationalinfo() {
		return nuriationalinfo;
	}
	public void setNuriationalinfo(String nuriationalinfo) {
		this.nuriationalinfo = nuriationalinfo;
	}
	@Override
	public String toString() {
		return "DairyFarm [productid=" + productid + ", productname=" + productname + ", price=" + price + ", imageUrl="
				+ imageUrl + ", energy=" + energy + ", fat=" + fat + ", protien=" + protien + ", nuriationalinfo="
				+ nuriationalinfo + "]";
	}
	
	
	
	
}
