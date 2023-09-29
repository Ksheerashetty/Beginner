// Switch Case statement
// Programming languages have some conditional / decision-making statements that execute when some specific condition is fulfilled.
// Switch-case is one of the ways to implement them.In a menu-driven program, the user is given a set of choices of things to do (the menu) and then is asked to select a menu item.
// There are 2 choices in the menu:
// Choice 1 is to find the area of a circle having radius.
// Choice 2 is to find the area of a rectangle having dimensions.
// Consider the choice and print the appropriate area.
// Sample Input 1:
// 2
// 3 2
// Sample Output 1:
// 6.00000
// Explanation Of Sample Input 1 :
// Since the choice ‘ch’ is 2, we have to print the area of the rectangle having ‘l’ = 3 and ‘b’ = 2, which is 6.
// Sample Input 2:
// 1
// 3
// Sample Output 2:
// 28.27433
// Explanation Of Sample Input 2 :
// Since the choice ‘ch’ is 1, we have to print the area of the circle having ‘r’ = 3, which is approximately 28.274333882308138. Rounded off to 5 decimal places, we get 28.27433.
// Expected Time Complexity :
// The expected time complexity is O(1).
// Constraints :
// 1 <= ‘ch’ <= 2
// 1 <= ‘r’ <= 100
// 1 <= ‘l’, ‘b’ <= 100
// Time limit: 1 second


public class SwitchCase {
    public static double areaSwitchCase(int ch, double []a) {
        double area = 0.0;

        // Using switch-case to figure out whose area we want to find

        switch (ch) {

            case 1: // Circle
                area = Math.PI * a[0] * a[0];
                break;

            case 2: // Rectangle
                area = a[0] * a[1];

        }

        // Returning the calculated area
        return area;
    }
}
