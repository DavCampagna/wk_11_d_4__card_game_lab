import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

   @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void queenHasValue10() {
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }

    @Test
    public void canGetValuesFromSuitEnum() {
        assertEquals(4, card.getValuesFromSuitEnum());
    }

    @Test
    public void canGetValuesFromRankEnum() {
        assertEquals(13, card.getValuesFromRankEnum());
    }
}
