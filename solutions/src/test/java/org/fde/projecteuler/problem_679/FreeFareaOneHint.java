package org.fde.projecteuler.problem_679;

import org.apache.commons.lang3.Validate;

public class FreeFareaOneHint {
    private final static String HINT = "FREE";

    private final int wordLength;
    private int count;

    public FreeFareaOneHint(int wordLength) {
        this.count = 0;
        this.wordLength = wordLength;
    }

    public int go() {
        Validate.isTrue(wordLength >= HINT.length());

        int free = wordLength - HINT.length();

        for (int before = 0; before <= free; ++before) {
            int after = free - before;



            Word word = new Word(wordLength);
            before(before, after, word);
        }

        return this.count;
    }

    private void before(int before, int after, Word word) {
        if (before == 0) {
            word.add(HINT);
            after(after, word);
            word.remove(HINT);;
        }
        else {
            for (char c : FreeFarea.ALPHABET) {
                word.add(c);
                before(before - 1, after, word);
                word.remove();
            }
        }
    }

    private void after( int after, Word word) {
        if (after == 0) {
            boolean isTargetFound = word.findTarget();

            if (isTargetFound) {
                ++count;
            }
        }
        else {
            for (char c : FreeFarea.ALPHABET) {
                word.add(c);
                after(after - 1, word);
                word.remove();
            }
        }
    }
}
