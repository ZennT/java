import java.util.Arrays;

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
//
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

        int[] array = {1, 3, 7, 5};
        int findIndexNumber7 = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 7){
                findIndexNumber7 = i;
            }
        }
        System.out.println("Number 7 is located at index: " + findIndexNumber7);


    }
}
