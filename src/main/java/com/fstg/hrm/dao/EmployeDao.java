package com.fstg.hrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.hrm.bean.Employe;

@Repository
public interface EmployeDao extends JpaRepository<Employe, Long>{
     public Employe findByCne(String cne);
}
