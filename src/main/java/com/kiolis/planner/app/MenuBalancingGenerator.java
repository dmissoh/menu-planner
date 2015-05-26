package com.kiolis.planner.app;

import com.kiolis.planner.domain.Menu;
import com.kiolis.planner.domain.MenuBalance;
import com.kiolis.planner.domain.Recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by kiolis on 20/05/15.
 */
public class MenuBalancingGenerator {
  public MenuBalance createMenuBalance() {
	MenuBalance menuBalance = new MenuBalance();
	List<Recipe> recipesList = new ArrayList<Recipe>();

	/*
	Random randomGenerator = new Random();
	for(int i = 0; i < 10000; i++){
	  Recipe recipe = new Recipe();
	  recipe.setId((long) i);
	  recipe.setFat(randomGenerator.nextInt(10));
	  recipe.setProtein(randomGenerator.nextInt(10));
	  recipe.setSugar(randomGenerator.nextInt(10));
	  recipesList.add(recipe);
	}
	*/


	Recipe recipe = new Recipe();
	recipe.setId(1L);
	recipe.setFat(3);
	recipe.setProtein(2);
	recipe.setSugar(1);
	recipesList.add(recipe);

	recipe = new Recipe();
	recipe.setId(2L);
	recipe.setProtein(10);
	recipe.setFat(2);
	recipe.setSugar(4);
	recipesList.add(recipe);

	recipe = new Recipe();
	recipe.setId(3L);
	recipe.setProtein(1);
	recipe.setFat(1);
	recipe.setSugar(3);
	recipesList.add(recipe);

	recipe = new Recipe();
	recipe.setId(4L);
	recipe.setProtein(2);
	recipe.setFat(2);
	recipe.setSugar(1);
	recipesList.add(recipe);

	recipe = new Recipe();
	recipe.setId(5L);
	recipe.setProtein(2);
	recipe.setFat(1);
	recipe.setSugar(6);
	recipesList.add(recipe);

	recipe = new Recipe();
	recipe.setId(6L);
	recipe.setProtein(2);
	recipe.setFat(4);
	recipe.setSugar(5);
	recipesList.add(recipe);

	recipe = new Recipe();
	recipe.setId(7L);
	recipe.setProtein(3);
	recipe.setFat(3);
	recipe.setSugar(3);
	recipesList.add(recipe);

	recipe = new Recipe();
	recipe.setId(8L);
	recipe.setFat(7);
	recipe.setProtein(5);
	recipe.setSugar(2);
	recipesList.add(recipe);

	recipe = new Recipe();
	recipe.setId(9L);
	recipe.setProtein(5);
	recipe.setFat(6);
	recipe.setSugar(7);
	recipesList.add(recipe);

	recipe = new Recipe();
	recipe.setId(10L);
	recipe.setFat(1);
	recipe.setProtein(3);
	recipe.setSugar(5);
	recipesList.add(recipe);

	menuBalance.setRecipeList(recipesList);

	List<Menu> menuList = new ArrayList<Menu>();

	Menu menu = new Menu();
	menu.setId(1L);
	menu.setFat(11);
	menu.setProtein(10);
	menu.setSugar(8);
	menuList.add(menu);

	/*
	menu = new Menu();
	menu.setId(2L);
	menu.setProtein(50);
	menu.setFat(30);
	menu.setSugar(20);
	//menuList.add(menu);

	menu = new Menu();
	menu.setId(3L);
	menu.setProtein(20);
	menu.setFat(10);
	menu.setSugar(2);
	//menuList.add(menu);
	*/


	menuBalance.setMenuList(menuList);

	return menuBalance;
  }
}
