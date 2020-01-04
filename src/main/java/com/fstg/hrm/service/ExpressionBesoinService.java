package com.fstg.hrm.service;

import java.util.List;

import com.fstg.hrm.bean.ExpressionBesoin;




public interface ExpressionBesoinService {
	 public void save(ExpressionBesoin expressionBesoin );
	  public List<ExpressionBesoin> findAll();
}
