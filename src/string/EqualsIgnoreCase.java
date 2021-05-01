package string;

import java.util.Scanner;

/**
 * equalsIgnoreCase
 *  *  same as equals method except, it ignores the case. Returns boolean: true if equals, false if not.
 *  *  Syntax: stringName.equalsIgnoreCase(String anotherString)
 */

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String realUserName = "codingbook";
        String realPassword = "MyPassword";
        System.out.println("Please enter the username");
        String typedUsername = scanner.nextLine();
        System.out.println("Please enter the password");
        String typedPassword = scanner.nextLine();
        if(realUserName.equalsIgnoreCase(typedUsername.toLowerCase()) && realPassword.equals(typedPassword)){
            System.out.println("Opening your account");
        } else {
            System.out.println("Username or password is incorrect");
        }
    }
}
