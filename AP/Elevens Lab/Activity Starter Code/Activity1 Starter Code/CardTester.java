/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  Card c1 = new Card("Ace", "Spades", 1);
  Card c2 = new Card("4", "Clubs", 4);
  Card c3 = new Card("4", "Clubs", 4);
  
  System.out.println("c1 = " + c1);
  System.out.println("c2 = " + c2);
  System.out.println("c3 = " + c3);
  
  // matches class tests get functions as well
  System.out.println("c2 = c3?\t" + c2.matches(c3));
 }
}
