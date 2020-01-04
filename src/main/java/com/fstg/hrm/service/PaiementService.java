package com.fstg.hrm.service;

import java.util.List;

import com.fstg.hrm.bean.Paiement;




public interface PaiementService {
	 public void save(Paiement paiement );
	  public List<Paiement> findAll();
}
