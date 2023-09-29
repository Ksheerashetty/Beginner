// Data Type
// Sample Input 1:
// Long
// Sample Output 1:
// 8
// Explanation Of Sample Input 1 :
// The size of a Long variable is given as 8 bytes.
// Sample Input 2:
// Float
// Sample Output 2:
// 4
// Explanation Of Sample Input 2 :
// The size of a Float variable is given as 4 bytes.
// Expected Time Complexity :
// The expected time complexity is O(1).
// Constraints :
// ‘type’ is one of the data types given above.
// Time limit: 1 second

import java.*;
public class DataType {
    public static int dataTypes(String type) {
        // Write your code here
        if(type.equals("Integer") || type.equals("Float"))
        return 4;
        if(type.equals("Long") || type.equals("Double"))
        return 8;
        else
        return 1;   
    }
}
/* Can also do
return (type.equals("Integer"))?4: type.equals("Float")?4:(type.equals("Long"))?8 :(type.equals("Double"))? 8: 1;
*/
