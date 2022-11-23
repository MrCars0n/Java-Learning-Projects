/* Carson Kramer
   12-7-20
   Recursion
     When a method calls itself either directly or indirectly
     Requires 2 cases - recursive case which calls upon a smaller problem which eventually gets down to the other case, known as the base case, which is when the recurvion will stop
     You may also think of these cases as "we don't yet have the final answer" vs " we do"
     
   Factorial w/ iteration:  5! = 5 * 4 * 3 * 2 * 1
   Factorial w/ recursion:  5! = 5 * 4!
*/

import java.math.*;   // BigInteger

public class Recursion
{
  public static void main(String args[])
  {
    System.out.println(factIter(5));
    System.out.println(factorial(5));
    
    for (int x=0; x<= 100; x++)
      System.out.println(x + "! = " + factorial(BigInteger.valueOf(x)));
  }
  
  public static BigInteger factorial(BigInteger n)
  {
    if (n.compareTo(BigInteger.ONE) <= 0)  // if n is 1 or 0
      return BigInteger.ONE;
    else
      return n.multiply(factorial(n.subtract(BigInteger.ONE)));
  }
  
  public static int factorial(int n)
  {
    // Recusive Case
    if (n > 1)
      return n* factorial(n-1);
    // Base Case
    else
      return 1;
  }
  
  public static int factIter(int n)
  {
    int f = 1;
    for (int x = 1; x <= n; x++)
      f *= x;
    
    return f;
  }
}