// Check if it is an array sorted in ascending order.
import java.util.*;
public class SortedOrNot {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];
      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }
      boolean isAscending = true;
       for(int i=0; i<numbers.length-1; i++) { // 
           if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
               isAscending = false;
           }
       }
       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }      
   }
}
//Output:
// 5
// 4 3 1 6 5
// The array is not sorted in ascending order
// 5
// 1 2 3 4 5
// The array is sorted in ascending order
