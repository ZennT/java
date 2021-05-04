package string;

/**
 * concatenate the string with the passed string
 * Syntax: stringName.concat(anotherString)
 */

public class Concat {
    public static void main(String[] args) {
        String name = "CodingBook";
        String academy = "Academy";
        String fullName = name.concat(" " + academy);
        System.out.println(fullName);
    }
}
