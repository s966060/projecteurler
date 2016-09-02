package org.fde.problem_002;

import org.fde.util.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by filipdelbaen on 26/07/16.
 */
public class SumOfEvenFibonacciNumbers {

    public static final int LIMIT_4M = 4_000_000;
    public static final int LIMIT_1G = 1_000_000_000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(1);

        int fibonacci;

        int sum = 0;
        double ratio;

        do {
            int index = list.size();

            fibonacci = list.get(index - 1)
                    + list.get(index - 2);

            list.add(fibonacci);

            Logger.log("fibonacci = " + fibonacci);

            if ((fibonacci <= LIMIT_4M) && ((fibonacci & 1) == 0)) {
                sum += fibonacci;
            }

            ratio = (double) list.get(index) / (double) list.get(index - 1);
            Logger.log("ratio = " + ratio);
        } while (fibonacci <= LIMIT_1G);

        Logger.log("sum = " + sum);

        double goldenRatio = (1 + Math.sqrt(5)) / 2.0;
        Logger.log("goldenRatio = " + goldenRatio);

        double diffRatios = Math.abs(goldenRatio - ratio);
        Logger.log("diffRatios = " + diffRatios);
    }
}
