package com.kiolis.planner.domain.solver;

import com.kiolis.planner.domain.Recipe;
import org.apache.commons.lang.builder.CompareToBuilder;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by kiolis on 20/05/15.
 */
public class RecipeDifficultyComparator implements Comparator<Recipe>, Serializable {
  public int compare(Recipe a, Recipe b) {
	return new CompareToBuilder()
			.append(a.getRequiredMultiplicand(), b.getRequiredMultiplicand())
			.toComparison();
  }
}
