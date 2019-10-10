import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card1;

    @Before
    public void before() {
        deck = new Deck();
        card1 = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.cardsCount());
    }

    @Test
    public void canAddCard() {
        deck.addCard(card1);
        assertEquals(1, deck.cardsCount());
    }

    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.cardsCount());
    }


//    @Test
//    public void suitsRanks() {
//        assertEquals(13, deck.getRanksFromEnum());
//    }


//    @Test
//    public void checkDeckHasSuit() {
//        deck.populateDeckWithASuit()
//    }
}
