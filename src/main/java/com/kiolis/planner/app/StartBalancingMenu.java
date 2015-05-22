package com.kiolis.planner.app;

import com.kiolis.planner.domain.Menu;
import com.kiolis.planner.domain.MenuBalance;
import com.kiolis.planner.domain.Recipe;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

/**
 * Created by kiolis on 20/05/15.
 */
public class StartBalancingMenu {

  public static void main(String[] args) {
	// Build the Solver
	SolverFactory solverFactory = SolverFactory.createFromXmlResource("menuBalancingSolverConfig.xml");
	Solver solver = solverFactory.buildSolver();

	MenuBalance unsolvedMenuBalance = new MenuBalancingGenerator().createMenuBalance();
	solver.solve(unsolvedMenuBalance);


	MenuBalance solvedCloudBalance = (MenuBalance) solver.getBestSolution();
	System.out.println("\nSolved menuBalance:\n" + toDisplayString(solvedCloudBalance));
  }

  public static String toDisplayString(MenuBalance menuBalance) {
	StringBuilder displayString = new StringBuilder();
	for (Recipe recipe : menuBalance.getRecipesList()) {
	  Menu menu = recipe.getMenu();
	  displayString.append("  ").append(recipe.getLabel()).append(" -> ")
			  .append(menu == null ? null : menu.getLabel()).append("\n");
	}
	return displayString.toString();
  }

}
