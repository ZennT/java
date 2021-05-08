package string;

/**
 * returns a new string that removes the whitespace from the beginning an d the end of the string
 * Syntax: stringName.trim();
 */

public class Trim {
    public static void main(String[] args) {
        String name = "    Welcome to CodingBook Academy     ";
        System.out.println(name);
        String name1 = name.trim();
        System.out.println(name1);

    }
}
