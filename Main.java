import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Program details
        System.out.println("Menu-Driven Card Deck Program");
        System.out.println("Name: [Your Name]");
        System.out.println("PRN: [Your PRN]");
        System.out.println("Batch: [Your Batch]");

        // Create a new deck of cards
        Deck deck = new Deck();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n1. Print Deck");
            System.out.println("2. Print Card");
            System.out.println("3. Same Card");
            System.out.println("4. Compare Card");
            System.out.println("5. Find Card");
            System.out.println("6. Deal Card");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            // Get user choice
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Print deck
                    deck.printDeck();
                    break;
                case 2:
                    // Print card
                    System.out.print("Enter the card number (1-52): ");
                    int cardIndex = sc.nextInt() - 1;
                    deck.printCard(cardIndex);
                    break;
                case 3:
                    // Same card
                    System.out.print("Enter the card number (1-52): ");
                    int sameCardIndex = sc.nextInt() - 1;
                    deck.sameCard(String.valueOf(sameCardIndex));
                    break;
                case 4:
                    // Compare cards
                    System.out.print("Enter the first card number (1-52): ");
                    int compareCardIndex1 = sc.nextInt() - 1;
                    System.out.print("Enter the second card number (1-52): ");
                    int compareCardIndex2 = sc.nextInt() - 1;
                    deck.compareCard(compareCardIndex1,compareCardIndex2);
                    break;
                case 5:
                    // Find card
                    System.out.print("Enter the rank of the card (1-13): ");
                    String rank = String.valueOf(sc.nextInt());
                    System.out.print("Enter the suit of the card (1-4): ");
                    int suit = sc.nextInt();
                    deck.findCard(rank, String.valueOf(suit));
                    break;
                case 6:
                    // Deal cards
                    deck.dealCard();
                    break;
                case 7:
                    // Shuffle deck
                    deck.shuffleDeck();
                    break;
                case 8:
                    // Exit
                    System.out.println("Exiting program...");
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        } while (choice != 8);

        // Close scanner
        sc.close();
    }
}
