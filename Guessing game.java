
package guess;
import java.util.*;
import java.util.Scanner;
public class Guess {

	public static void main(String[] args) {
		
		System.out.println("Enter a number between 1 to 100, you'll have only 5 chances!!");
		for(int i=1;i<=5;i++) {
		System.out.println("Guess the number");
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();
		//Random rand = new Random(100);
		int b = (int) (100 *Math.random());
		System.out.println("The number is " +b);
		if(a==b) {
			System.out.println("CONGRATULATIONS");
			System.out.println("You guessed it right!!");
			break;
		} else {
			System.out.println("OOPS!");
			System.out.println("Better luck next time ^_^");
			
		}
		System.out.println("You've " +(5-i)+ " chances left");
		if(i==6) {
		System.out.println("You are out of chance :/ ");
		}
	 }		
	}
}
