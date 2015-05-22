package com.kiolis.planner.solver.score;

import com.kiolis.planner.domain.Menu;
import com.kiolis.planner.domain.MenuBalance;
import com.kiolis.planner.domain.Recipe;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.score.director.easy.EasyScoreCalculator;

/**
 * Created by kiolis on 20/05/15.
 */
public class MenuBalancingEasyScoreCalculator implements EasyScoreCalculator<MenuBalance> {
  public HardSoftScore calculateScore(MenuBalance menuBalance) {
	int hardScore = 0;
	int softScore = 0;
	for (Menu menu : menuBalance.getMenuList()) {

	  int fatUsage = 0;
	  int sugarUsage = 0;
	  int proteinUsage = 0;

	  // Calculate usage
	  for (Recipe recipe : menuBalance.getRecipesList()) {
		if (menu.equals(recipe.getMenu())) {
		  fatUsage += recipe.getFat();
		  sugarUsage += recipe.getSugar();
		  proteinUsage += recipe.getProtein();
		}
	  }

	  // Hard constraints
	  int menuFatAvailable = menu.getFat() - fatUsage;
	  if (menuFatAvailable < 0) {
		hardScore += menuFatAvailable;
	  }
	  int menuSugarAvailable = menu.getSugar() - sugarUsage;
	  if (menuSugarAvailable < 0) {
		hardScore += menuSugarAvailable;
	  }
	  int menuProteinAvailable = menu.getProtein() - proteinUsage;
	  if (menuProteinAvailable < 0) {
		hardScore += menuProteinAvailable;
	  }

	  if(menu.getId() == 2){
		//hardScore = -1000;
	  }

	}
	return HardSoftScore.valueOf(hardScore, softScore);
  }
}
