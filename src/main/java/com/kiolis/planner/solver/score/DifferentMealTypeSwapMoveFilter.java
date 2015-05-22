package com.kiolis.planner.solver.score;

import com.kiolis.planner.domain.Recipe;
import org.optaplanner.core.impl.heuristic.selector.common.decorator.SelectionFilter;
import org.optaplanner.core.impl.heuristic.selector.move.generic.SwapMove;
import org.optaplanner.core.impl.score.director.ScoreDirector;

public class DifferentMealTypeSwapMoveFilter implements SelectionFilter<SwapMove> {

    public boolean accept(ScoreDirector scoreDirector, SwapMove move) {
        Recipe leftRecipe = (Recipe) move.getLeftEntity();
        Recipe rightRecipe = (Recipe) move.getRightEntity();
        return true;
    }

}