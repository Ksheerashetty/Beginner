import java.util.Scanner;
 
public class Voting {
 public static void main(String[] args) 
 {
    int age;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your age: ");
    age = scan.nextInt();
    // Checking condition for voting
    if(age>=18)
    {
        System.out.println("You are eligible for voting :)");
    }
    else
    {
    System.out.println("Sorry,You are not eligible for voting :(");
    }
 }
}


// Output:
// Please enter your age: 
// 18
// You are eligible for voting :)
// Please enter your age: 
// 12
// Sorry,You are not eligible for voting :(

//Example 2:
//return greater if a is greater than a , smaller if b is smaller ,equal if a and b are equal
// return(a>b)? "greater": (b>a)?"smaller":"equal";
