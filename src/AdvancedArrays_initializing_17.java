import java.sql.SQLOutput;
import java.util.Arrays;

public class AdvancedArrays_initializing_17 {
    public static void main(String[] args) {

            // Arrays are zero indexed
            // sample array {3,5,7,5,2,7,5,9,1,8}
            // Array Indexed : 0 - 9 (Total 10 elements)
            // Change any elements using arrayName[indexPosition]
            // if you want to change the 5th index (6th element) in the array,
            // you write arrayName[5] = 10;

            // INITIALIZING - 1 (Initializing when declaring (on the same line))
            // int[] myArray = new int[] {1, 2, 3, 4}; (you don't need to write
            // new int[] or new String[] if you are initializing and declaring at the same time
            // "new" means I want to create space for the elements

            //String[] myStringArray = {"hi", "there"};


            // INITIALIZING - 2 (Declaring first, then initializing)
            // int[] myArray;   --> declaring
            // myArray = int[] {1, 2, 3, 4}; --> initializing

//            int[] myIntArray;
//            myIntArray = new int[]{1, 2, 3, 4};  // you have to use new int[]
//                                                 // since declaration and initialization are not at the same line
//            System.out.println(Arrays.toString(myIntArray)); // toString --> array in elemanlarini
//                                                             // yazdirmak icin kullandik
            // INITIALIZING - 3 (Initializing one element at a time)
            // int[] myArray = new int[4];  // creating space for each element
            // myArray[0] = 5;              // initializing each element seperately
            // myArray[1] = 3;
            // myArray[2] = 6;
            // myArray[3] = 10;

            // INITIALIZING - 4 (Initializing using a loop)
//             int[] myArray = new int[8];
//             for(int i = 0; i < myArray.length; i++){
//                myArray[i] = i * i;   //array in elemanini bu kurala gore degistiriyorum, en basta 0 idi
//                 //System.out.println(Arrays.toString(myArray));
//                // loop icinde yazildigi icin her dongude print yapar
//                }
//             System.out.println(Arrays.toString(myArray));

        int[] myArray = new int[5];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = i + i;
        }
          System.out.println(Arrays.toString(myArray));









    }





}
