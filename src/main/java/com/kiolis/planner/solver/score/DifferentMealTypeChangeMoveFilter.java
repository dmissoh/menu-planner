package com.kiolis.planner.solver.score;

import com.kiolis.planner.domain.Menu;
import com.kiolis.planner.domain.Recipe;
import org.optaplanner.core.impl.heuristic.selector.common.decorator.SelectionFilter;
import org.optaplanner.core.impl.heuristic.selector.move.generic.ChangeMove;
import org.optaplanner.core.impl.heuristic.selector.move.generic.SwapMove;
import org.optaplanner.core.impl.score.director.ScoreDirector;

public class DifferentMealTypeChangeMoveFilter implements SelectionFilter<ChangeMove> {

    public boolean accept(ScoreDirector scoreDirector, ChangeMove move) {
        return true;
    }

}