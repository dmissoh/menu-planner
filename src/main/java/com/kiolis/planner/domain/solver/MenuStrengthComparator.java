package com.kiolis.planner.domain.solver;

import com.kiolis.planner.domain.Menu;
import org.apache.commons.lang.builder.CompareToBuilder;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by kiolis on 21/05/15.
 */
public class MenuStrengthComparator implements Comparator<Menu>, Serializable {
  public int compare(Menu a, Menu b) {
	return new CompareToBuilder()
			.append(a.getMultiplicand(), b.getMultiplicand())
			.toComparison();
  }
}
