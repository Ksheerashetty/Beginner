//Find maximum number and minimum number in the given array without built-in.
import java.util.*;
public class MaxMin {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int ele[] = new int[size];
      //input
      for(int i=0; i<size; i++) {
          ele[i] = sc.nextInt();
      }
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
     
       for(int i=0; i<ele.length; i++) {
           if(ele[i] < min) {
               min = ele[i];
           }
           if(ele[i] > max) {
               max = ele[i];
           }
       }
       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
   }
}
// Output:
// 5
// 8 4 9 2 7
// Largest number is : 9
// Smallest number is : 2
