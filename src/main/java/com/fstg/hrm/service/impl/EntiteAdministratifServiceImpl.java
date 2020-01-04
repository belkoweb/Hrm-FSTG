package com.fstg.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.hrm.bean.EntiteAdministratif;
import com.fstg.hrm.dao.EntiteAdministratifDao;

import com.fstg.hrm.service.EntiteAdministratifService;


@Service
public class EntiteAdministratifServiceImpl implements EntiteAdministratifService {
   @Autowired
  private EntiteAdministratifDao entiteAdministratifDao;
   public EntiteAdministratif findByReference(String ref) {
	   return entiteAdministratifDao.findByReference(ref);
   }
     public void deleteByReference(String ref)
     {
    	 entiteAdministratifDao.deleteByReference(ref);
     }
	@Override
	public void save(EntiteAdministratif entiteAdministratif) {
		entiteAdministratifDao.save(entiteAdministratif);
		
	}
	@Override
	public List<EntiteAdministratif> findAll() {
		return entiteAdministratifDao.findAll();
	}
	@Override
	public void deleteByRef(String ref) {
	 entiteAdministratifDao.deleteByReference(ref);
		
	}

}



