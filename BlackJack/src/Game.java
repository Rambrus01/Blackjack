import java.util.Scanner;

public class Game {
    private Deck deckManager = new Deck();
    private Hand handManager = new Hand();
    private Hand handManagerAi = new Hand();
    private Scanner input = new Scanner(System.in);

    public Game(){
    }

    public void draw (Hand handManager){
        handManager.addCardtoHand(this.deckManager.getDeck().get(0));
        deckManager.getDeck().remove(0);
        System.out.println(handManager.getCards());
        System.out.println(handManager.getValueofCardinHand());
    }

    public void game (){
        while(true){
            System.out.println("Press h to draw a card or s to stop!");
            String hit = input.next();

            if (hit.equals("h")){
                this.draw(this.handManager);

                if (handManager.getValueofCardinHand() > 21){
                    System.out.println("your hand's value is more than 21, you lost.");
                    break;
                }
            } else if (hit.equals("s")){
                System.out.println("Your hand's value is: "+ handManager.getValueofCardinHand());

                this.stop();
                this.victory();

                break;
            } else{
                System.out.println("that was not a correct button!");
            }
        }
    }

    public void victory (){
        if (handManager.getValueofCardinHand() < handManagerAi.getValueofCardinHand() && handManagerAi.getValueofCardinHand() < 21){
            System.out.println("You Lost!");
        } else{
            System.out.println("Congratulations, you won!");
        }
    }

    public void stop (){
        while (handManagerAi.getValueofCardinHand() < 21){

            if (handManagerAi.getValueofCardinHand() < 11){
                this.draw(handManagerAi);
            } else {
                double random = Math.random();

                if (random < 0.2){
                    this.draw(handManagerAi);
                } else {
                    break;
                }
            }
        }
    }
}
