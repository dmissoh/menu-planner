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
	  int sugarAvailable = menu.getSugar() - sugarUsage;
	  if (sugarAvailable < 0) {
		hardScore += sugarAvailable;
	  }
	  int proteinAvailable = menu.getProtein() - proteinUsage;
	  if (proteinAvailable < 0) {
		hardScore += proteinAvailable;
	  }
	}
	return HardSoftScore.valueOf(hardScore, softScore);
  }
}
