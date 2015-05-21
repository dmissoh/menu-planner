package com.kiolis.planner.domain;

import com.kiolis.planner.common.domain.AbstractPersistable;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.score.buildin.hardsoft.HardSoftScoreDefinition;
import org.optaplanner.persistence.xstream.impl.score.XStreamScoreConverter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by kiolis on 20/05/15.
 */
@PlanningSolution
public class MenuBalance extends AbstractPersistable implements Solution<HardSoftScore> {

  private List<Recipe> recipesList;

  private List<Menu> menuList;

  private HardSoftScore score;

  public HardSoftScore getScore() {
	return score;
  }

  public void setScore(HardSoftScore score) {
    this.score = score;
  }

  @ValueRangeProvider(id = "menuRange")
  public List<Menu> getMenuList() {
    return menuList;
  }

  @PlanningEntityCollectionProperty
  public List<Recipe> getRecipesList() {
    return recipesList;
  }

  public void setRecipeList(List<Recipe> processList) {
    this.recipesList = processList;
  }

  public void setMenuList(List<Menu> menuList) {
    this.menuList = menuList;
  }

  public Collection<? extends Object> getProblemFacts() {
    List<Object> facts = new ArrayList<Object>();
    facts.addAll(menuList);
    // Do not add the planning entity's (processList) because that will be done automatically
    return facts;
  }
}
