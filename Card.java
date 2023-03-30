public class Card {
    private String suit;    //suit of the card
    private String rank;    //rank of the card

    //Constructor to initialize the suit and rank of the card
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    //Getter method for suit
    public String getSuit() {
        return suit;
    }

    //Getter method for rank
    public String getRank() {
        return rank;
    }

    //Method to print the card details
    public void printCard() {
        System.out.println(rank + " of " + suit);
    }

    //Method to check if two cards belong to the same suit
    public boolean sameSuit(Card otherCard) {
        return this.suit.equals(otherCard.getSuit());
    }

    //Method to check if two cards have the same rank
    public boolean sameRank(Card otherCard) {
        return this.rank.equals(otherCard.getRank());
    }
}
