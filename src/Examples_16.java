import java.util.Scanner;

public class Examples_16 {
    public static void main(String[] args) {

        // PROBLEM 1 Print first 10 natural numbers
//        for(int num = 0; num < 11; num++){
//            System.out.println(num);
//        }


//        int num = 0;
//        while (num < 11){
//            System.out.println(num);
//            num++;
//        }
//         -------------
        //PROBLEM 2
        //Accept a number from user and calculate the sum of
        // all numbers between 1 and the accepted number

//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a number:");
//        int number = scanner.nextInt();
//
//        //run a for loop starting from 1 till number
//         for(int num = 1; num <= number; num++){
//             // add all numbers
//             sum +=num;  //sum = sum + num
//         }
//        System.out.println(sum);
//
//      --------------
        //PROBLEM 3
        //Ask the user to guess a number that you initialized
        //If the user guesses wrong, print:You guessed wrong
        //If they guess right, print: You guessed right
        //The user should only get 3 tries.

//        Scanner scanner = new Scanner(System.in);
//        int myNumber = 3;
//
//        for(int i = 0; i<3; i++){
//            System.out.println("Guess a number: ");
//            int guessedNumber = scanner.nextInt();
//            if(myNumber == guessedNumber){
//                System.out.println("You guessed right");
//                break;
//            }else{
//                System.out.println("You guessed wrong");
//            }
//        }
//      ----------------
        //PROBLEM 4
        // Using a for loop, find the number of even and odd numbers
        //Print them
        //example int[] intArray = new int[]{1,2,3,4,5};

        // while
        int[] whileArray = new int[]{5,6,7,9,3}; // [9] ifadesi icinde 9 tane 0 var farzeder
        int evenCount = 0;
        int oddCount = 0;
        int i = 0;

        while (i < whileArray.length){
            if(whileArray[i] % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
            i++;
        }

        System.out.println("There are " + evenCount + " even numbers");
        System.out.println("There are " + oddCount + " odd numbers");

          // first for try
//        int[] newArray = new int[]{3,5,7,9};
//        int oddCount = 0;
//        int evenCount = 0;
//
//        for(int i = 0; i < newArray.length; i++){
//            if(newArray[i] % 2 == 0){
//                evenCount++;
//            }else{
//                oddCount++;
//            }
//
//        }
//        System.out.println("There are " + evenCount + " even numbers");
//        System.out.println("There are " + oddCount + " odd numbers");
//
//        ----------------------
          // second for try
//        int[] myArray = new int[]{1,2,3,4,5};
//        int oddCount = 0;
//        int evenCount = 0;
//        for(int i = 0; i < myArray.length; i++)
//        {
//            if(myArray[i] % 2 == 0)
//            {
//                evenCount++;
//            }
//            else {
//                oddCount++;
//            }
//
//        }
//        System.out.println("There are " + evenCount + " even numbers");
//        System.out.println("There are " + oddCount + " odd numbers");

    }
}
