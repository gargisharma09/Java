/*public class code {

   * This is my first java program.
    * This will print 'Hello World' as the output
    *

   public static void main(String []args) {
      System.out.println("Hello World"); // prints Hello World
   }
}*/

/*public class main{
   public static void main(String[] args) {
      System.out.println("hello world");
   }
      
   
   
   */

// conditionl stats
import java.util.Scanner;


public class Conditions {
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int age = sc.nextInt();
      if (age >= 18) {
         System.out.println("adult");
      }

      else {
         System.out.println("not adult");
      }
   
      
   }  
}