package string;

import java.util.Scanner;

/**
 * length --> returns the length of the string
 * Syntax : stringName.length();
 */

public class String_length {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the phone number");
        String phoneNumber = scan.nextLine();
        int lengthOfPhoneNumber = phoneNumber.length();
        if(lengthOfPhoneNumber == 10){
            System.out.println("Phone number is valid");
        } else {
            System.out.println("Invalid phone number");
        }

    }
}
