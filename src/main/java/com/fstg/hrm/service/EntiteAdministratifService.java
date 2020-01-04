package com.fstg.hrm.service;

import java.util.List;

import com.fstg.hrm.bean.EntiteAdministratif;



public interface EntiteAdministratifService {
	public void save(EntiteAdministratif entiteAdministratif );
	public List<EntiteAdministratif> findAll();
	public void deleteByRef(String ref);
	public EntiteAdministratif findByReference(String ref);
	void deleteByReference(String ref);
}
