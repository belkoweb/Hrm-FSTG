package com.fstg.hrm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.hrm.bean.ExpressionBesoin;

@Repository
public interface ExpressionBesoinDao extends JpaRepository<ExpressionBesoin, Long>{

}
