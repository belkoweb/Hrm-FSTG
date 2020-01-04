package com.fstg.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.hrm.bean.Produit;
import com.fstg.hrm.dao.ProduitDao;
import com.fstg.hrm.service.ProduitService;



public class ProduitServiceImpl implements ProduitService {
  @Autowired
  private ProduitDao produitDao;
	@Override
	public void save(Produit produit) {
		produitDao.save(produit);
		
	}

	@Override
	public List<Produit> findAll() {
		
		return produitDao.findAll();
	}

	

	
}
