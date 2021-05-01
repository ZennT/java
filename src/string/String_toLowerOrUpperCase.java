package string;

import java.util.Locale;

/**
 * toLower Case
 * makes all the characters in the string lower case
 * Syntax : stringName.toLowerCase();
 *
 * toUpperCase
 * makes all the cahracters in the string uppercase
 * Syntax : stringName.toUpperCase();
 */

public class String_toLowerOrUpperCase {
    public static void main(String[] args) {
        String myName = "Ozen Turkoz";

        String myLowerCaseName = myName.toLowerCase();
        System.out.println("My name is:" + myLowerCaseName);

        String abbreviation = "unicef";
        String abbreviationCaps = abbreviation.toUpperCase();
        System.out.println("The abbreviation is:" + abbreviationCaps);
    }
}
