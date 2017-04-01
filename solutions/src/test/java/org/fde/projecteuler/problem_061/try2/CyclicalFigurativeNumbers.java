package org.fde.projecteuler.problem_061.try2;

import org.fde.projecteuler.problem_061.try2.figurative_numbers.*;
import org.junit.Test;

import static org.fde.projecteuler.problem_061.try2.FigurativeNumbers.createFigurativeNumbers;

public class CyclicalFigurativeNumbers {
    @Test
    public void cyclicalFigurativeNumbers() {
        FigurativeNumbers triangles = createFigurativeNumbers(new Triangle());
        FigurativeNumbers squares = createFigurativeNumbers(new Square());
        FigurativeNumbers pentagonals = createFigurativeNumbers(new Pentagonal());
        FigurativeNumbers hexagonals = createFigurativeNumbers(new Hexagonal());
        FigurativeNumbers heptagonals = createFigurativeNumbers(new Heptagonal());
        FigurativeNumbers octogonals = createFigurativeNumbers(new Octagonal());

        FigurativeNumbersList figurativeNumbersList = new FigurativeNumbersList(
                triangles, squares, pentagonals, hexagonals, heptagonals, octogonals);

        for(FigurativeNumbers figurativeNumbers : figurativeNumbersList) {
            FigurativeNumbersList nextFigurativeNumbersList
                    = figurativeNumbersList.createWithout(figurativeNumbers);

            for(Long value : figurativeNumbers.getNumbers()) {
                match(value, nextFigurativeNumbersList);
            }
        }
    }

    private void match(Long value, FigurativeNumbersList figurativeNumbersList) {

    }
}
