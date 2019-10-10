import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int cardsCount() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void populateDeck() {
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();

        for (int suit = 0; suit < suits.length; suit++)
        {
            for (int rank = 0; rank < ranks.length; rank++)
            {
                cards.add(new Card(suits[suit], ranks[rank]));
            }
        }
    }


//    public int getRanksFromEnum() {
//        SuitType[] suits = SuitType.values());
//        RankType[] ranks = RankType.values();
//        return ranks.length;
//    }

//    public int getSuitsFromEnum() {
//
//        suitType[] suits = suitType.values();
//        return suits.length;
//    }

}
