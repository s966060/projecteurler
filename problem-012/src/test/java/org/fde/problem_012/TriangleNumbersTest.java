package org.fde.problem_012;

import org.fde.util.combinations.CombinationFactory;
import org.fde.util.combinations.CombinationList;
import org.fde.util.TriangleNumbers;
import org.fde.util.primes.Divisors;
import org.fde.util.primes.PrimeFactors;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TriangleNumbersTest {
    @Test
    public void theTriangleNumberWithMoreThan500Divisors() {
        TriangleNumbers numbers = new TriangleNumbers();

        Divisors divisors = new Divisors();

        long number = 0;
        List<Long> divisorList = new ArrayList<>();

        // one is not included, so we step at 500 and thus total divisors = 501
        while (divisorList.size() <= 500) {
            number = numbers.next();
            divisorList = divisors.getDivisors(number);
        }

        System.out.println("divisorList = " + divisorList);
        System.out.println("number = " + number);

        assertEquals(76576500L, number);
    }
}
