package string;

/**
 * compareTo
 * allows you to compare two strings in lexicographical (alphabetical) order
 * returns 0 if the strings are equal in lexicographical order
 * returns negative number if the string argument passed is greater than string
 * return positive number if the string argument passed is less than string
 * Syntax : stringName.compareTo(String anotherString)
 * compares according to Unicode value of the characters
 *
 * compareToIgnoreCase
 * same as compare to, except it ignores the case
 * Syntax: stringName.compareToIgnoreCase(String another String)
 *
 */

public class CompareTo {
    public static void main(String[] args) {
//        String firstStr = "CodingBook";
//        String secondStr = "CodeBook12345";
//        int returnNumber = firstStr.compareTo(secondStr);
//        System.out.println("Difference firstStr and secondStr: " + returnNumber);

        String firstStr = "CodingBook";
        String secondStr = "codingbook";
        int returnNumber = firstStr.compareToIgnoreCase(secondStr);
        System.out.println("Difference firstStr and secondStr: " + returnNumber);



    }
}
