package com.fstg.hrm.service;

import java.util.List;

import com.fstg.hrm.bean.Employe;
import org.springframework.stereotype.Service;



@Service
public interface EmployeService {
	 public void save(Employe employe );
	 public List<Employe> findAll();
         public Employe findByCne(String cne);
         public Employe update(Long id, Employe employe);
         public void deleteById(Long id);
}
