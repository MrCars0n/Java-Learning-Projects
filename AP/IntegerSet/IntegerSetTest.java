// IntegerSetTest
// 3-5-21
// Period 4
// Carson Kramer

public class IntegerSetTest
{
  public static void main(String args[])
  {
    IntegerSet preset1 = new IntegerSet(new int[]{2, 4, 7, 10});
    IntegerSet preset2 = new IntegerSet(new int[]{1, 2, 3, 4, 5});
    
    IntegerSet preset1Copy = new IntegerSet(new int[]{2, 4, 7, 10});
    
    IntegerSet random1 = new IntegerSet(new int[]{(int)(Math.random() * 101), (int)(Math.random() * 101), (int)(Math.random() * 101)});
    IntegerSet random2 = new IntegerSet(new int[]{(int)(Math.random() * 101), (int)(Math.random() * 101), (int)(Math.random() * 101)});
    
    IntegerSet default1 = new IntegerSet();
    
    // Default Constructor Test
    System.out.println("Default Constructor Test:");
    System.out.print("\t");
    default1.printSet();
    System.out.println();
    
    // Union Test    
    System.out.println("Union Test:");
    System.out.print("\t");
    preset1.printSet();
    System.out.print("\tU\t");
    preset1Copy.printSet();
    System.out.print("\t=\t");
    preset1.union(preset1Copy).printSet();
    System.out.println();
    
    System.out.print("\t");
    preset1.printSet();
    System.out.print("\tU\t");
    preset2.printSet();
    System.out.print("\t=\t");
    preset1.union(preset2).printSet();
    System.out.println();
    
    System.out.print("\t");
    random1.printSet();
    System.out.print("\tU\t");
    random2.printSet();
    System.out.print("\t=\t");
    random1.union(random2).printSet();
    System.out.println();
    
    // Intersection Test
    System.out.println("Intersection Test:");
    System.out.print("\t");
    preset1.printSet();
    System.out.print("\tn\t");
    preset1Copy.printSet();
    System.out.print("\t=\t");
    preset1.intersection(preset1Copy).printSet();
    System.out.println();
    
    System.out.print("\t");
    preset1.printSet();
    System.out.print("\tn\t");
    preset2.printSet();
    System.out.print("\t=\t");
    preset1.intersection(preset2).printSet();
    System.out.println();
    
    System.out.print("\t");
    random1.printSet();
    System.out.print("\tn\t");
    random2.printSet();
    System.out.print("\t=\t");
    random1.intersection(random2).printSet();
    System.out.println();
    
    // addNumber Test
    System.out.println("addNumber Test:");
    System.out.print("\taddNumber(5)\t=\t");
    preset1.addNumber(5);
    preset1.printSet();
    System.out.println();
    
    System.out.print("\taddNumber(10)\t=\t");
    random1.addNumber(10);
    random1.printSet();
    System.out.println();
    
    System.out.print("\taddNumber(15)\t=\t");
    random2.addNumber(15);
    random2.printSet();
    System.out.println();
    
    // removeNumber Test
    System.out.println("removeNumber Test:");
    System.out.print("\tremoveNumber(5)\t=\t");
    preset1.removeNumber(5);
    preset1.printSet();
    System.out.println();
    
    System.out.print("\tremoveNumber(10)\t=\t");
    random1.removeNumber(10);
    random1.printSet();
    System.out.println();
    
    System.out.print("\tremoveNumber(15)\t=\t");
    random2.removeNumber(15);
    random2.printSet();
    System.out.println();
    
    // isEqualTo Test
    System.out.println("isEqualTo Test:");
    System.out.print("\tIs\t");
    preset1.printSet();
    System.out.print("\t=\t");
    preset1Copy.printSet();
    System.out.print("?\t");
    System.out.println(preset1.isEqualTo(preset1Copy));
    
    System.out.print("\tIs\t");
    preset1.printSet();
    System.out.print("\t=\t");
    preset2.printSet();
    System.out.print("?\t");
    System.out.println(preset1.isEqualTo(preset2));
    
    System.out.print("\tIs\t");
    random1.printSet();
    System.out.print("\t=\t");
    random2.printSet();
    System.out.print("?\t");
    System.out.println(random1.isEqualTo(random2));
    
    // printSet Test throughout test file
  }
}