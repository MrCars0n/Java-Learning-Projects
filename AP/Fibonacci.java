/* Fibonacci Sequence
   0, 1, 1, 2, 3, 5, 8, ...
   
   Base case(s)
    0th term is 0
    1st term is 1
    
   Recursive case
    nth term is n-1 + n-2 term
*/

import java.math.*; // BigInteger class

public class Fibonacci
{
  public static void main (String args[])
  {
    for (int n=0; n<=40;n++)
    {
      System.out.println(n + "\t" + fib(BigInteger.valueOf(n)));
    }
  }
  
  public static BigInteger fib(BigInteger num)
  {
    if (num.equals(BigInteger.ZERO))
    {
      return BigInteger.ZERO;
    }
    else if (num.equals(BigInteger.ONE))
    {
      return BigInteger.ONE;
    }
    else
    {
      return fib(num.subtract(BigInteger.ONE)).add(fib(num.subtract(BigInteger.valueOf(2))));
    }
  }
}