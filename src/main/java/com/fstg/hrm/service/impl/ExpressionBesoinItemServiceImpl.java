package com.fstg.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.hrm.bean.ExpressionBesoinItem;
import com.fstg.hrm.dao.ExpressionBesoinItemDao;
import com.fstg.hrm.service.ExpressionBesoinItemService;



public class ExpressionBesoinItemServiceImpl implements ExpressionBesoinItemService {
   @Autowired
   private ExpressionBesoinItemDao expreExpressionBesoinDao;
	@Override
	public void save(ExpressionBesoinItem expressionBesoinItem) {
		expreExpressionBesoinDao.save(expressionBesoinItem);
		
	}

	@Override
	public List<ExpressionBesoinItem> findAll() {
	
		return expreExpressionBesoinDao.findAll();
	}

}
