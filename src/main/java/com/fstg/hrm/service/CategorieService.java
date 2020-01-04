package com.fstg.hrm.service;

import java.util.List;

import com.fstg.hrm.bean.Categorie;




public interface CategorieService {
	public void save(Categorie categorie);
	public List<Categorie> findAll();
	public Categorie findByLib(String lib);
}
