package com.fstg.hrm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class ExpressionBesoin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	@ManyToOne
	private Employe chefDepartement ;
	@ManyToOne
	  private EntiteAdministratif entiteAdministratif ;
	  private Date dateExpression ;
	  @OneToMany
	  private List<ExpressionBesoinItem> expressionBesoinItems = new ArrayList<ExpressionBesoinItem>() ;
	public ExpressionBesoin(Employe chefDepartement, EntiteAdministratif entiteAdministratif, Date dateExpression) {
		super();
		this.chefDepartement = chefDepartement;
		this.entiteAdministratif = entiteAdministratif;
		this.dateExpression = dateExpression;
	}
	public ExpressionBesoin(Employe chefDepartement, EntiteAdministratif entiteAdministratif, Date dateExpression,
			List<ExpressionBesoinItem> expressionBesoinItems) {
		super();
		this.chefDepartement = chefDepartement;
		this.entiteAdministratif = entiteAdministratif;
		this.dateExpression = dateExpression;
		this.expressionBesoinItems = expressionBesoinItems;
	}
	public ExpressionBesoin() {
		super();
	}
	public Employe getChefDepartement() {
		return chefDepartement;
	}
	public void setChefDepartement(Employe chefDepartement) {
		this.chefDepartement = chefDepartement;
	}
	public EntiteAdministratif getEntiteAdministratif() {
		return entiteAdministratif;
	}
	public void setEntiteAdministratif(EntiteAdministratif entiteAdministratif) {
		this.entiteAdministratif = entiteAdministratif;
	}
	public Date getDateExpression() {
		return dateExpression;
	}
	public void setDateExpression(Date dateExpression) {
		this.dateExpression = dateExpression;
	}
	public List<ExpressionBesoinItem> getExpressionBesoinItems() {
		return expressionBesoinItems;
	}
	public void setExpressionBesoinItems(List<ExpressionBesoinItem> expressionBesoinItems) {
		this.expressionBesoinItems = expressionBesoinItems;
	}
	  
}
