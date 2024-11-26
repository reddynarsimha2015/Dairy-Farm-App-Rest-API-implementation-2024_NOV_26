package com.nt.service;

import java.util.List;

import com.nt.model.DairyFarm;

public interface DairyFarmService {
	public DairyFarm createProduct(final DairyFarm dairyFarm);
	public List<DairyFarm> getAllProducts();
	public DairyFarm findByIdProduct(Long id);
	public String deleteProduct(Long userId);
	public String upateProduct(Long prodId, DairyFarm daiary);
}
