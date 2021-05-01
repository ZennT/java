package string;

import java.util.Scanner;

/**
 * equals
 *  - check whether the string is equal to another string passed an argument
 *  returns boolean : true if equals, false if not
 *  Syntax : stringName.equals(String anotherString);
 *
 */

public class Equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String realUserName = "codingbook";
        String realPassword = "MyPassword";
        System.out.println("Please enter the username");
        String typedUsername = scanner.nextLine();
        System.out.println("Please enter the password");
        String typedPassword = scanner.nextLine();
        if(realUserName.equals(typedUsername.toLowerCase()) && realPassword.equals(typedPassword)){
            System.out.println("Opening your account");
        } else {
            System.out.println("Username or password is incorrect");
        }


    }
}
