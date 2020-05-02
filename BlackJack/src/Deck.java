import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();
    private int[] valueofCard = new int[] {1,2,3,4,5,6,7,8,9,10,10,10,10,10};
    private String[] symbolofCard = new String[] {"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private String[] colorofCard = new  String[] {"Hearts","Diamonds","Clubs","Spades"};

    public Deck() {
        this.createDeck();
        this.shuffleDeck();
    }

    public ArrayList<Card> getDeck(){
        return this.deck;
    }

    public void createDeck(){
        for (String color : colorofCard){
            for(int index = 0; index < valueofCard.length; index++){
                deck.add(new Card(valueofCard[index], symbolofCard[index], color));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }
}
