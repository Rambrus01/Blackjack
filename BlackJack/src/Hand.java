import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cardsinHand = new ArrayList<Card>();

    public Hand() {
    }

    public void addCardtoHand(Card card) {
        this.cardsinHand.add(card);
    }

    public int getValueofCardinHand() {
        int value = 0;
        for(Card card: cardsinHand) {
            value += card.getValue();
        }
        return value;
    }

    public ArrayList<Card> getCards(){
        return this.cardsinHand;
    }
}
