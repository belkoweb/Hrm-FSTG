package com.fstg.hrm.service;

import java.util.List;

import com.fstg.hrm.bean.Produit;



public interface ProduitService {
	 public void save(Produit produit );
	 public List<Produit> findAll();
    
}
