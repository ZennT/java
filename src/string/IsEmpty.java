package string;

import java.util.Scanner;

/**
 * checks if the string is empty, i.e. the length() is 0
 * Syntax: stringName.isEmoty()
 */

public class IsEmpty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your email address to create an account");
        String email = scanner.nextLine();
        if(email.isEmpty()){
            System.out.println("Cannot create an account. Email cannot be empty");
        } else {
            if(email.endsWith(".com")){
                System.out.println("Account created successfully");
            } else {
                System.out.println("Invalid email address provided");
            }
        }

    }
}
