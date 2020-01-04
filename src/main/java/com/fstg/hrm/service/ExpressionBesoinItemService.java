package com.fstg.hrm.service;

import java.util.List;

import com.fstg.hrm.bean.ExpressionBesoinItem;



public interface ExpressionBesoinItemService {
	 public void save(ExpressionBesoinItem  expressionBesoinItem );
	  public List<ExpressionBesoinItem> findAll();
}
