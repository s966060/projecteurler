package org.fde.projecteuler;

import org.fde.util.Logger;

public class PythagorianTriplet {
    public static void main(String[] args) {
        int equalsCondition = 1000;

        // because x + y + z = 1000
        // and x < y < z
        // 332 + 333 + 334 = 1000
        int xLimit = 332;

        for (int x = 1; x <= xLimit; ++x) {
            // say x = 100
            // then yLimit = (1000 - 100) / 2 = 900 / 2 = 450
            // but x < y < z
            // 100 + 450 + 450 = 1000 is not allowed
            // thus 100 + 449 + 451
            int yLimit = (equalsCondition - x) / 2;
            int yLimitRemainder = (equalsCondition - x) % 2;

            if (yLimitRemainder == 0) {
                --yLimit;
            }

            for (int y = x + 1; y <= yLimit; ++y) {
                int z = 1000 - x - y;

                if (z <= 0) {
                    throw new IllegalArgumentException("z = " + z);
                }

                int sumOfSquares = x * x + y * y;
                int square = z * z;

                if (sumOfSquares == square) {
                    Logger.log("square = " + square);
                    Logger.log("sumOfSquares = " + sumOfSquares);
                    Logger.log("x = " + x);
                    Logger.log("y = " + y);
                    Logger.log("z = " + z);

                    Logger.log("x *y *z = " + x * y * z);
                    Logger.log();
                    Logger.log();
                }
            }
        }
    }
}
