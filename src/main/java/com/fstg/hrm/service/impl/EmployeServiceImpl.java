package com.fstg.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.hrm.bean.Employe;
import com.fstg.hrm.dao.EmployeDao;
import com.fstg.hrm.service.EmployeService;
import org.springframework.stereotype.Service;


@Service
public class EmployeServiceImpl  implements EmployeService{
    @Autowired
    private EmployeDao employeDao;
	@Override
	public void save(Employe employe) {
		employeDao.save(employe);
	}

	@Override
	public List<Employe> findAll() {
		
		return employeDao.findAll();
	}

    @Override
    public Employe findByCne(String cne) {
      return employeDao.findByCne(cne);
    }

    @Override
    public Employe update(Long id, Employe employe) {
      employe.setId(id);
      return employeDao.save(employe);
              
    }

    @Override
    public void deleteById(Long id) {
        employeDao.deleteById(id);
    }

}
