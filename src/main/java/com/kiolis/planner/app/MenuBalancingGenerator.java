package com.kiolis.planner.app;

import com.kiolis.planner.domain.Menu;
import com.kiolis.planner.domain.MenuBalance;
import com.kiolis.planner.domain.Recipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kiolis on 20/05/15.
 */
public class MenuBalancingGenerator {
  public MenuBalance createMenuBalance(int i, int i1) {
	MenuBalance menuBalance = new MenuBalance();
	List<Recipe> recipesList = new ArrayList<Recipe>();

	Recipe recipe = new Recipe();
	recipe.setId(1L);
	recipe.setFat(3);
	recipe.setProtein(5);
	recipe.setSugar(6);
	recipesList.add(recipe);

	recipe = new Recipe();
	recipe.setId(2L);
	recipe.setFat(2);
	recipe.setProtein(10);
	recipe.setSugar(4);
	recipesList.add(recipe);

	recipe = new Recipe();
	recipe.setId(3L);
	recipe.setFat(0);
	recipe.setProtein(1);
	recipe.setSugar(8);
	recipesList.add(recipe);

	menuBalance.setRecipeList(recipesList);

	List<Menu> menuList = new ArrayList<Menu>();

	Menu menu = new Menu();
	menu.setId(4L);
	menu.setProtein(1);
	menu.setFat(1);
	menu.setSugar(1);
	menuList.add(menu);

	menu = new Menu();
	menu.setId(5L);
	menu.setProtein(2);
	menu.setFat(3);
	menu.setSugar(6);
	menuList.add(menu);

	menuBalance.setMenuList(menuList);

	return menuBalance;
  }
}
