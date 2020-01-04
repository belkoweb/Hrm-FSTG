package com.fstg.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.hrm.bean.Categorie;
import com.fstg.hrm.dao.CategorieDao;
import com.fstg.hrm.service.CategorieService;



public class CategorieServiceImpl implements CategorieService {
	@Autowired
	private CategorieDao categorieDao;

	@Override
	public void save(Categorie categorie) {
		categorieDao.save(categorie);

	}

	@Override
	public List<Categorie> findAll() {
		
		return categorieDao.findAll();
	}

	@Override
	public Categorie findByLib(String lib) {
		
		return categorieDao.findByLib(lib);
	}

}
