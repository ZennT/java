public class ForEachLoop_22 {
    /**
     * for each loop
     * similar to for loop but an enhanced way of it
     * allows you to traverse(travel) each element in an array
     *    or collection, and to use them as you want (loops btw each elements)
     * for each is used only for arrays and collections
     * Instead of declaring and initializing the variable for iterations as in a loop,
     *   we declare a variable of the same type as the base of the array
     *   syntax --> for(data_type item : collection){
     *                      Statements using item
     *                      }
     * for loop once index e gider, for each dogrudan elemana gider
     */

    public static void main(String[] args) {
//        int[] myInt = {1,3,5,7};
//        //for loop
//        for(int i = 0; i < myInt.length; i++){
//            System.out.println(myInt[i]);
//        }
//
//        //for each loop
//        for(int element_in_myInt : myInt){       // element_in_myInt -->simdi tanimladim
//            System.out.println(element_in_myInt);
//        }


        //Print every element of am array using a for loop
//        int[] myArray = new int[]{5,7,9};
//        for(int i = 0; i < myArray.length; i++){ // i ->0, 1, 2 -> index numaralari
//            System.out.println(myArray[i]);      // myArray[i] ->5, 7, 9
//        }
//        for(int myElement : myArray){     // element -> 5, 7, 9
//            System.out.println(myElement);
//        }

        //NESTED for each loop
//        int[] myArray = new int[]{5,7,9};
//        int[] myArray2 = new int[]{60, 80};
//        for(int myElement : myArray){
//            for(int myElement2 : myArray2)
//            System.out.println(myElement + " and " + myElement2);
//        }

//        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sum =0;
//        for(int i : myArray){
//            sum += i;
//        }
//        System.out.println("The sum is : " + sum);

        int[]myArray = new int[] {5, 7, 9};
        int sum =0;
        for(int i : myArray){
            sum +=i;   // sum = sum + i;
        }
        System.out.println(sum);



    }
}

