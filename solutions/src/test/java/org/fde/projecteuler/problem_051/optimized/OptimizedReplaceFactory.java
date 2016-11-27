package org.fde.projecteuler.problem_051.optimized;

import org.fde.projecteuler.problem_051.*;
import org.fde.projecteuler.problem_051.Replace;

public class OptimizedReplaceFactory implements ReplaceFactory {
    @Override
    public Replace createReplace(int[] replaceIndexes) {
        return new OptimizedReplace(replaceIndexes);
    }

    @Override
    public Replace _null_() {
        return OptimizedReplace.NULL;
    }
}
