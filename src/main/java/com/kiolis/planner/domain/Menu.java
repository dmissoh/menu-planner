package com.kiolis.planner.domain;

import com.kiolis.planner.common.domain.AbstractPersistable;

import java.util.Map;

/**
 * Created by kiolis on 20/05/15.
 */
public class Menu extends AbstractPersistable {

  private int fat;
  private int protein;
  private int sugar;

  public enum MealType {
    BREAKFAST,
    LUNCH_STARTER,
    LUNCH_MAIN_DISH,
    LUNCH_DESSERT,
    DINNER_STARTER,
    DINNER_MAIN_DISH,
    DINNER_DESSERT
  }

  private MealType mealType;

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

  public int getMultiplicand() {
	return fat * protein * sugar;
  }

  public String getLabel() {
    return "Menu " + id;
  }

}
