package org.fde.projecteuler;

import org.fde.util.Logger;
import org.fde.util.primes.PrimeBuilder;

public class SumOfPrimes {
    public static void main(String[] args) {
        PrimeBuilder builder = new PrimeBuilder();

        long sum = 0;
        long prime;

        while ((prime = builder.next()) < 2_000_000) {
            sum += prime;
        }

        Logger.log("sum = " + sum);
    }
}
