public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit() {
        return this.suit;
    }

    public RankType getRank() {
        return this.rank;
    }

    public int getValueFromEnum() {
        return this.rank.getValue();
    }

    public int getValuesFromSuitEnum() {
        SuitType[] suits = SuitType.values();
        return suits.length;
    }

    public int getValuesFromRankEnum() {
        RankType[] ranks = RankType.values();
        return ranks.length;
    }
}
