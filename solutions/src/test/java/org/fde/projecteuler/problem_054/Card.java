package org.fde.projecteuler.problem_054;

class Card {
    final Ranking ranking;
    final Suite suite;

    Card(Ranking ranking, Suite suite) {
        this.ranking = ranking;
        this.suite = suite;
    }

    static Card fromCode(final String code) {
        String rankingCode = code.trim().substring(0, 1);
        String suiteCode = code.trim().substring(1, 2);

        Ranking ranking = Ranking.fromCode(rankingCode);
        Suite suite = Suite.fromCode(suiteCode);

        return new Card(ranking, suite);
    }

    @Override
    public String toString() {
        return "Card{" +
                "ranking=" + ranking +
                ", suite=" + suite +
                '}';
    }
}
