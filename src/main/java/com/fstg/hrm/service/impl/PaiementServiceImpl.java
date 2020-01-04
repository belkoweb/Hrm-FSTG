package com.fstg.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.hrm.bean.Paiement;
import com.fstg.hrm.dao.PaiementDao;
import com.fstg.hrm.service.PaiementService;



public class PaiementServiceImpl implements PaiementService {
     @Autowired
     private PaiementDao paiementDao;
	@Override
	public void save(Paiement paiement) {
		paiementDao.save(paiement);
		
	}

	@Override
	public List<Paiement> findAll() {
		
		return paiementDao.findAll();
	}

}
