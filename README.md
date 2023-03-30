This is a menu-driven Java program that simulates a deck of 52 playing cards. The deck is made up of four suits (clubs, diamonds, hearts, spades) and 13 ranks (Ace, 2-10, Jack, Queen, King). The program is divided into two classes: Card and Deck. Card represents an individual playing card and Deck represents a deck of cards.

Usage
To use the program, follow these steps:

Open a terminal or command prompt.
Navigate to the directory containing the program files.
Compile the program by running the command javac *.java.
Run the program by running the command java Main.
The program will display a menu of options to choose from:

Print Deck - displays the entire deck of cards.
Print Card - allows the user to enter a card number (1-52) and displays the corresponding card.
Same Card - allows the user to enter a card number (1-52) and displays all other cards in the same suit.
Compare Card - allows the user to enter two card numbers (1-52) and displays whether they have the same rank or not.
Find Card - allows the user to enter a rank (1-13) and a suit (1-4) and displays the first matching card in the deck.
Deal Card - deals five random cards from the deck.
Shuffle Deck - shuffles the deck randomly.
Exit - exits the program.
Implementation Details
The program implements the following methods in the Deck class:

createDeck() - creates a new deck of 52 cards.
printDeck() - prints the entire deck of cards.
printCard(int cardIndex) - prints the card at the specified index in the deck.
sameCard(int cardIndex) - prints all cards in the same suit as the card at the specified index in the deck.
compareCard(int cardIndex1, int cardIndex2) - prints whether the two cards at the specified indices in the deck have the same rank.
findCard(int rank, int suit) - prints the first card in the deck with the specified rank and suit.
dealCard() - deals five random cards from the deck.
shuffleDeck() - shuffles the deck randomly.
The Card class represents an individual playing card and contains the following properties:

rank - the rank of the card (Ace, 2-10, Jack, Queen, King)
suit - the suit of the card (clubs, diamonds, hearts, spades)
Coding Guidelines
The program follows the following coding guidelines:

Each method is separated into its own function.
The program uses ArrayList to store the deck of cards.
The program uses the Scanner class to read user input.
The program includes comments to explain the logic of each method.
