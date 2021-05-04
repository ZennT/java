package string;

import java.util.Scanner;

/**
 * checks if the string starts with the given sequence of characters
 * Syntax: stringName.startsWith(String anotherString)
 */

public class StartsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your ID number");
        String managerId = scanner.nextLine();
        if(managerId.startsWith("123") && managerId.length() == 10){
            System.out.println("Manager successfully logged in.");
        }else {
            System.out.println("Invalid ID");
        }
    }
}
