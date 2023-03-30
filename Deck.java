import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;  //list of cards in the deck

    //Constructor to create the deck of cards
    public Deck() {
        cards = new ArrayList<Card>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    //Method to print the deck of cards
    public void printDeck() {
        for (Card card : cards) {
            card.printCard();
        }
    }

    //Method to print a specific card in the deck
    public void printCard(int index) {
        cards.get(index).printCard();
    }

    //Method to check if two cards in the deck belong to the same suit
    public void sameCard(String suit) {
        for (Card card : cards) {
            if (card.getSuit().equals(suit)) {
                card.printCard();
            }
        }
    }

    //Method to check if two cards in the deck have the same rank
    public void compareCard(String rank) {
        for (Card card : cards) {
            if (card.getRank().equals(rank)) {
                card.printCard();
            }
        }
    }

    //Method to find a specific card in the deck
    public void findCard(String suit, String rank) {
        for (Card card : cards) {
            if (card.getSuit().equals(suit) && card.getRank().equals(rank)) {
                card.printCard();
                return;
            }
        }
        System.out.println("Card not found in the deck.");
    }

    //Method to deal 5 random cards from the deck
    public void dealCard() {
        Collections.shuffle(cards);
        for (int i = 0; i < 5; i++) {
            cards.get(i).printCard();
        }
    }

    //Method to shuffle the deck of cards
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public void compareCard(int compareCardIndex1, int compareCardIndex2) {
    }
}
