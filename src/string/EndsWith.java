package string;

import java.util.Scanner;

/**
 * checks if the string ends with the given sequence of characters
 * Syntax: stringName.endsWith(String anotherString)
 */

public class EndsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your student email:");
        String email = scanner.nextLine();
        if(email.endsWith(".edu")){
            System.out.println("This is a valid student email.");
        } else {
            System.out.println("This is an invalid email.");
        }


    }
}
