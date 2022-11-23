// Methods Examples
// Period 4
// 11-19-20
// Carson Kramer

public class MethodExamples
{
  public static void main(String args[])
  {
    System.out.println(areaRect(3,5));
    
    System.out.println(sameFinalDigit(174, 94));
  }
  
  // Code the area of the rectangle given the length and witdh
  
  public static int areaRect(int length, int width)
  {
    return length * width;
  }
  
  // Code the boolean method to see whether the numbers end in the same digit
  
  public static boolean sameFinalDigit(int num1, int num2)
  {
    return num1 % 10 == num2 % 10;
  }
}