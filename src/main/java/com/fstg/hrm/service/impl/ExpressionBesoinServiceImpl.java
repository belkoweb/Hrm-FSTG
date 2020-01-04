package com.fstg.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.hrm.bean.ExpressionBesoin;
import com.fstg.hrm.dao.ExpressionBesoinDao;
import com.fstg.hrm.service.ExpressionBesoinService;



public class ExpressionBesoinServiceImpl implements ExpressionBesoinService{
   @Autowired
   private ExpressionBesoinDao expressionBesoinDao;
	@Override
	public void save(ExpressionBesoin expressionBesoin) {
		expressionBesoinDao.save(expressionBesoin);
		
	}

	@Override
	public List<ExpressionBesoin> findAll() {
		
		return expressionBesoinDao.findAll();
	}

}
