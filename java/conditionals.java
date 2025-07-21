// conditionl stats
/*import java.util.Scanner;


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
}*/
//eveen or odd
import java.util.*;

public class Conditions {        
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      if (X % 2 == 0) {
         System.out.println("even");
      } else {
         System.out.println("odd");
      }
      sc.close();

   }
}

