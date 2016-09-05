package org.fde.util.permutations;

import org.fde.util.ListOfLong;

public class Permutation {
    private final ListOfLong list;

    public Permutation() {
        this.list = new ListOfLong();
    }

    public Permutation(long... elements) {
        this();

        for (long el : elements) {
            add(el);
        }
    }

    private Permutation(ListOfLong list) {
        this.list = list;
    }

    public void add(long el) {
        this.list.add(el);
    }

    @Override
    public String toString() {
        return "Permutation{" +
                "list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Permutation that = (Permutation) o;

        return list.equals(that.list);

    }

    @Override
    public int hashCode() {
        return list.hashCode();
    }

    public PermutationList createNewPermutations(Long el) {
        PermutationList newPermutations = new PermutationList();

        // the backwards loops is just for the output order
        // nothing special
        for (int index = list.size(); index >= 0; --index) {
            ListOfLong newList = new ListOfLong(this.list);

            newList.add(index, el);

            newPermutations.add(new Permutation(newList));
        }

        return newPermutations;
    }
}
