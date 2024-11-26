package com.nt.model;

import java.util.List;

public class DairyFarmResponse {
	List<DairyFarm> products;

	public List<DairyFarm> getProducts() {
		return products;
	}

	public void setProducts(List<DairyFarm> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "DairyFarmResponse [products=" + products + ", getProducts()=" + getProducts() + "]";
	}

	

	

	
	
}
