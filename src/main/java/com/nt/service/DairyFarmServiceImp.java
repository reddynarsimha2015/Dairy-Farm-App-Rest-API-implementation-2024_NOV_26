package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.DairyFarm;
import com.nt.repsoitory.DairyFarmRepository;
@Service
public class DairyFarmServiceImp implements DairyFarmService {
	@Autowired
	DairyFarmRepository resp;
	public DairyFarm createProduct(final DairyFarm dairyFarm) {
		final DairyFarm farm = resp.save(dairyFarm);
		return farm;
		
	}
	public List<DairyFarm> getAllProducts() {
		final List<DairyFarm> list = resp.findAll();
		return list;
	}
	@Override
	public DairyFarm findByIdProduct(Long id) {
		// TODO Auto-generated method stub
		DairyFarm d=resp.findById(id).orElseThrow(()->new RuntimeException("NO id found for product"));
		return d;
	}
	@Override
	public String deleteProduct(Long userId) {
		// TODO Auto-generated method stub
		DairyFarm resps = resp.findById(userId).orElse(null);
		// TODO Auto-generated method stub
		if (resps == null)
			throw new RuntimeException("NO Product PRESENT WITH ID = " + userId);
		else {
			resp.delete(resps);
			return "Delete product Name Success" + resps.getProductname();
		}
	}
	public String upateProduct(Long id, DairyFarm req) {
		// TODO Auto-generated method stub
		// find by id
		DairyFarm resps = resp.findById(id).orElse(null);
		System.out.println("-----reps----"+resps);

		if (resps == null)
			throw new RuntimeException("No Such Product exists!!");
		else {
			DairyFarm resp1=mapReqToResp(resps,req);
			resp.save(resp1);
			return "Record updated Successfully";
		}

	}
	private DairyFarm mapReqToResp(DairyFarm resp,DairyFarm req) {
		// TODO Auto-generated method stub
		
		resp.setEnergy(req.getEnergy());
		resp.setFat(req.getFat());
		resp.setImageUrl(req.getImageUrl());
		 resp.setNuriationalinfo(req.getNuriationalinfo());
		 resp.setPrice(req.getPrice());
		 resp.setProductname(req.getProductname());
		 resp.setProtien(req.getProtien());
		return resp;
	}
	
}
