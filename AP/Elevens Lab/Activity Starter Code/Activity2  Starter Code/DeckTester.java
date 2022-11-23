/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  Deck d1 = new Deck(["Ace", "King", "3"], ["Clubs", "Spades", "Clubs"], [1, 13, 3]);
  Deck d2 = new Deck(["5", "6", "Queen"], ["Hearts", "Diamonds", "Clubs"], [5, 6, 12]);
  Deck d3 = new Deck(["8", "2", "Jack"], ["Clubs", "Spades", "Clubs"], [1, 13, 3]);
 }
}
