import java.util.Arrays;
import java.util.Scanner;

public class forEachExercises_23 {
    public static void main(String[] args) {
        /**
         * Find the minimum number in an array using for each loop
         */

//        int[] array = new int[]{3,5,8};
//        int min = array[0];   //min degeri array deki ilk elemana esledim
//        for(int i : array){
//            if(i < min){
//                min = i;  // her dongude min degeriyle elemanlari tek tek karsilastirir
//            }
//        }
//        System.out.println(min);

        /**
         * Can you update an array by updating each element in for each loop?
         * The answer is NO since for each loop doesn't have indises.
         */

//        int[] array = {1, 2, 3, 4};
//        for(int i : array){
//            i = i * i;
//        }
//        System.out.println("The new updated Array is : " + Arrays.toString(array));

        /**
         * Can you keep track of the index in afor each loop?
         * NO for each doesn't use indexes
         */

//        int[] array = {1, 3, 7, 5};
//        int findIndexNumber7 = 0;
//        for(int i = 0; i < array.length; i++){
//            if(array[i] == 7){
//                findIndexNumber7 = i;
//            }
//        }
//        System.out.println("Number 7 is located at index: " + findIndexNumber7);

        /**
         * Can you iterate with more than one steps in for each loop?
         * NO cunku for each de iteration part yok
         */

//        int[] array = {1, 3, 5, 7, 9, 11};
//        for(int i = 0; i < array.length; i +=2){
//            System.out.println(array[i]);     // prints --> 1, 5, 9 cunku i 2 artarak ilerliyor
//        }

        /**
         * Ask user how many numbers they want to sort
         * Ask user to enter all numbers
         * Store them in an array
         * Sort that array in an ascending order (without using Arrays.sort)
         * Print the array
         * 209 nolu video 50. dakika civari
         */

        // my array --> 5 7 3 6
        // I need two for loops to go and compare each
        // ilk eleman, 5, diger elemanlarla karsilastirilir kendisinden kucuk olan varsa onunla yer degistirir
        // bu ornekte 3 basa gelir,
        // ilk eleman,3 oldu, diger elemanlarla karsilastirilir ve kucuk olanla yer degistirir
        // 5 7 3 6 --> 3 7 5 6 --> 3 5 7 6 --> 3 5 6 7 -->switching elements
        //3 5(elements) -> 0 1(index numbers)
        // temp = arr[0] = arr[1]
        //5 5
        //arr[1] = temp
        //5 3


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to sort ");
        int size = scan.nextInt();

        int[] unsortedArray = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter a value: ");
            unsortedArray[i] = scan.nextInt();
        }
        //System.out.println(Arrays.toString(unsortedArray));
        //sorting array with descending order without using Array.sort
        int temp;
        int[] sortedArray = Arrays.copyOf(unsortedArray, size); //copied array
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(sortedArray[i] > sortedArray[j]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        System.out.println("My unsorted Array : " + Arrays.toString(unsortedArray));
        System.out.println("My sorted array: " + Arrays.toString(sortedArray));


    }
}
