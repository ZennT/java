package string;

/**
 * STRING CLASS
 * String methods -->
 * String class has methods that you can use to manipulate the string
 * These methods allow you to:
 *  - find the length of the given string
 *  - check whether the string is empty or not
 *  - check whether two strings are equal or not
 *  - check if the string contains another string
 *  - convert the given string to character array
 *  - split the strings
 *  - replace the strings with other strings
 *
 */

public class EN210_Java_String_API {
    public static void main(String[] args) {
        //INITIALIZATION - 1 (Using String Literals)
        String str = "Hello World!";
        String welcome = "Welcome to Coding Book!'";
        System.out.println(str);
        System.out.println(welcome);

        //INITIALIZATION - 2 (Using new keyword)
        char[] characters = {'H','e','l','l','o','W','o','r','l','d','!'};
        String charString = new String(characters);
        System.out.println(charString);

        String welcomeString = new String("Welcome to CodingBook!");
        System.out.println(welcomeString);

    }

}
