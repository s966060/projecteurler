package org.fde.projecteuler.problem_679.fail_last;

import org.junit.Assert;
import org.junit.Test;

import static org.fde.projecteuler.problem_679.FreeFarea.*;

public class FreeFareaBruteForceTest {
    // Runtime ~ 35 sec
    @Test
    public void bruteForce_15() {
        int wordLength = 15;
        FreeFareaBruteForce engine = new FreeFareaBruteForce(wordLength);
        int count = engine.go();

        System.out.println("wordLength = " + wordLength);
        System.out.println("count = " + count);
        Assert.assertEquals(EXPECTED_15, count);
    }

    // Runtime ~ 2min 25 sec
    @Test
    public void bruteForce_16() {
        int wordLength = 16;
        FreeFareaBruteForce engine = new FreeFareaBruteForce(wordLength);
        int count = engine.go();

        System.out.println("wordLength = " + wordLength);
        System.out.println("count = " + count);
        Assert.assertEquals(EXPECTED_16, count);
    }

    // Runtime ~ 10 min
    @Test
    public void bruteForce_17() {
        int wordLength = 17;
        FreeFareaBruteForce engine = new FreeFareaBruteForce(wordLength);
        int count = engine.go();

        System.out.println("wordLength = " + wordLength);
        System.out.println("count = " + count);
        Assert.assertEquals(EXPECTED_17, count);
    }
}
