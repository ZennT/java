package string;

/**
 * Syntax: stringNmae.substring(int startIndex);
 *   - returns a new string that contains the sequence of characters starting from an index
 *  Syntax : stringName.substring(int startIndex, int endIndex);
 *   - returns a new string that contains the sequence of characters starting from an index
 *   to a specific index
 */

public class Substring {
    public static void main(String[] args) {
        String hello = "Hi everyone! I hope you all are doing great.";
        System.out.println(hello);
        String substring = hello.substring(13);  //13. indexten baslasin istiyorum, index 0 dan basliyor
        System.out.println("The new substring starting from index 13 is: " + substring);
        String substring1 = hello.substring(13,19);
        System.out.println("The new substring starting from 13 and ending at 19 (not inclusive) is: " + substring1);

    }
}
