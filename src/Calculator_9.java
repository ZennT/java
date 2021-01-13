import java.util.Scanner;

public class Calculator_9 {
    public static void main(String[] args) {


        // Get user input using scanner --> number 1
        // Get user input using scanner --> number 2
        // Get user input using scanner --> + - * /
        // For example number1 = 1, number2 = 2, operator = + My result would be 3
        // switch to read the operator, find the result of the calculation, print
        // scan.nextInt(); if you want to scan an integer as user input use this


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int number1 = scan.nextInt(); // scan the next integer user entered

        System.out.println("Enter your second number:");
        int number2 = scan.nextInt();

        System.out.println("Enter one of the listed operators + - * / : ");
        String operator = scan.next();
        double result = 0;

        switch (operator){
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                System.out.println("Not a valid operator");
        }
        System.out.println(number1 + "" +  operator + "" + number2 + "" + " is equal to " + "" + result  );

    }
}
