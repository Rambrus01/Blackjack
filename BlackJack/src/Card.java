public class Card {

    private int value;
    private String symbol;
    private String color;

    public Card(int value, String symbol, String color) {
        this.value = value;
        this.symbol = symbol;
        this.color = color;
    }

    public int getValue(){
        return this.value;
    }
    public String getSymbol(){
        return this.symbol;
    }
    public String getColor(){
        return this.color;
    }

    public String toString() {
        return color+" "+symbol;
    }
}
