package org.fde.util;

import java.util.Iterator;

public class DigitList implements Iterable<Digit> {
    private final MyList<Digit> digits;

    public DigitList() {
        this.digits = new MyList<>();
    }

    public DigitList(ListOfLong list) {
        this();

        for (long value : list) {
            add(value);
        }
    }

    public void add(long digit) {
        this.digits.add(Digit.valueOf(digit));
    }

    public void reverse() {
        this.digits.reverse();
    }

    public void rotateRight() {
        this.digits.rotateRight();
    }

    @Override
    public Iterator<Digit> iterator() {
        return this.digits.iterator();
    }

    public long getValue() {
        long total = 0;

        for (Digit digit : this) {
            total *= 10;
            total += digit.getValue();
        }

        return total;
    }

    public boolean isEmpty() {
        return this.digits.isEmpty();
    }

    public void truncateRight() {
        this.digits.removeLast();
    }

    public void truncateLeft() {
        this.digits.removeFirst();
    }

    public static DigitList createDigitList(Integer... digits) {
        DigitList list = new DigitList();

        for(Integer digit: digits) {
            list.add(digit);
        }

        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DigitList longs = (DigitList) o;

        return digits.equals(longs.digits);

    }

    @Override
    public int hashCode() {
        return digits.hashCode();
    }

    public void sort() {
        this.digits.sort();
    }

    public int size() {
        return this.digits.size();
    }

    public static DigitList valueOf(final long value) {
        DigitList digitList = new DigitList();

        if (value == 0) {
            digitList.add(0);
            return digitList;
        }

        int digits = (int) Math.floor(Math.log10(value)) + 1;

        long newValue = value;

        for (int i = 1; i <= digits; ++i) {
            long digit = newValue % 10;
            newValue /= 10;
            digitList.add(digit);
        }

        digitList.reverse();
        return digitList;
    }
}
