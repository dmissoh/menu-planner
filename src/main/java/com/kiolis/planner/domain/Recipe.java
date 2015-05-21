package com.kiolis.planner.domain;

import com.kiolis.planner.common.domain.AbstractPersistable;
import com.kiolis.planner.domain.solver.MenuStrengthComparator;
import com.kiolis.planner.domain.solver.RecipeDifficultyComparator;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

/**
 * Created by kiolis on 20/05/15.
 */
@PlanningEntity(difficultyComparatorClass = RecipeDifficultyComparator.class)
public class Recipe extends AbstractPersistable {

  private int fat;
  private int protein;
  private int sugar;

  // Planning variables: changes during planning, between score calculations.
  private Menu menu;

  @PlanningVariable(valueRangeProviderRefs = {"menuRange"}, strengthComparatorClass = MenuStrengthComparator.class)
  public Menu getMenu() {
	return menu;
  }

  public void setMenu(Menu menu) {
	this.menu = menu;
  }

  public int getFat() {
	return fat;
  }

  public void setFat(int fat) {
	this.fat = fat;
  }

  public int getProtein() {
	return protein;
  }

  public void setProtein(int protein) {
	this.protein = protein;
  }

  public int getSugar() {
	return sugar;
  }

  public void setSugar(int sugar) {
	this.sugar = sugar;
  }

  public int getRequiredMultiplicand() {
    return fat * protein * sugar;
  }

  public String getLabel() {
    return "Recipe " + id;
  }

}
