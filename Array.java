// 1.Creating an Array  - with new keyword
// int[] marks = new int[3];
// marks[0] = 97;
// marks[1] = 98;
// marks[2] = 95;

// 2.Creating an Array 
// int[] marks = {98, 97, 95};

// Taking an array as an input and printing its elements.
import java.util.*;


public class Array {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int numb[] = new int[size];


       for(int i=0; i<size; i++) {
           numb[i] = sc.nextInt();
       }


       //print the numbers in array
       for(int i=0; i<numb.length; i++) {
           System.out.print(numb[i]+" ");
       }
   }
}

// Output:
// 2
// 6 9
// 6 9 
