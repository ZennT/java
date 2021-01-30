
public class BasicArray_While_11 {
    // WHAT IS AN ARRAY
    // Used to store bunch of values of the same data type into a variable
    // Default values are given zero (false for boolean)

    public static void main(String[] args) {

//        int[] number; //define an int array  //int yerine baska bir data type olabilir
//        number = new int[5]; // initialization // you have 5 different element of int
//                                // and you are creating space for them
//        number [0] = 0; //0. elemanin degeri 0
//        number [1] = 1; // 1. elemanin degeri 1
//        number [2] = 2;
//        number [3] = 3;
//        number [4] = 4;
//        System.out.print(number[0]);  // println yerine print yazarsan yanyana yazdirir
//        System.out.print(number[1]);
//        System.out.print(number[2]);
//        System.out.print(number[3]);
//        System.out.print(number[4]);


        // WHILE LOOP
        // allows you to run certain blocks of code while the condition is true
        // first, checks whether the condition is true
        // second, if the condition is true, it will run the code inside the while loop
        // if the condition is false, it will exit the while loop and continue with the rest of the program
        // condition false olana kadar calisir

        // SYNTAX while(condition) {
        //              Statements
        // }

//        int number = 1;                   // initialization
//        while (number < 5) {              // condition
//            System.out.println(number);
//            number++;
//        }

//      ---------------------------------
//        int number = 0;
//        while (number <= 10){
//            System.out.println(number);      // 0-10 arasi rakamlari tek tek yazdirir, suslu parantez disina alirsan kac eleman oldugunu yazdirir
//            number++;
//        }
//      -----------------------------------
//        int num = 0;
//        int sum = 0;       // en bastaki degeri 0
//        while (num <= 10){
//            sum = sum + num; // her loopda sum update olur
//            num++;
//            System.out.println("The sum of the first 10 numbers: " + sum);  // suslu parantez icindeyken toplama islemini adim adim yazdiriyor
//        }
//      --------------------------------------------
//        int num = 0;
//        int sum = 0;       // en bastaki degeri 0
//        while (num <= 10) {
//            sum = sum + num;
//            num++;
//        }
//            System.out.println("The sum of the first 10 numbers: " + sum); // suslu parantez disindayken toplama isleminin sonucunu yazdiriyor
//
//      -------------------------------------------------
//        int num = 10;
//        while (num < 10) {   // condition false oldugu icin while loop never run
//            System.out.println(num);
//            num++;    //--> bu satiri iptal edersen infinite loop a girer
//
//        }

 //     -----------------------------------------------------

//        int[] nums = {0,1,2,3,4,5,6,7,8,9};
//        int i = 0;
//        while (i < nums.length) {
//            System.out.println(nums[i]);
//            i++;
//        }

 //       -----------------------------------------------------

        int[] nums = new int[10];
        int num = 0;
        while(num < 20) {
            System.out.println(num);
            nums[num] = num * 10;
            num++;
        }
        // Burasi "out of bounds" hatasi verir. cunku olusturdugumu array 10 elemanli ve
        // num<20 sartini saglamasi icin daha fazla eleman olmali.
        // num<20 sartini num<nums.length sekklinde degistirirsek problem duzelir

    }

}