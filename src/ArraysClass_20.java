import java.util.Arrays;

public class ArraysClass_20 {

    /**
     * THE ARRAYS CLASS
     * A class that has many static methods used with an array
     * These methods can be used for:
     *  - convert an array to String --> Arrays.toString(array);
     *  - sort an array  --> Arrays.sort(array); -> (ascending order-from smallest to largest)
     *                   --> Arrays.sort(array,fromIndex,toIndex); -> sadece istedigimiz araligi sort etmek icin
     *                      ->fromIndex:4,toIndex:7 orneginde 4. indexden basla 7. indexe kadar diyoruz,
     *                      4 dahil,7 haric
     *  - search an array --> Arrays.binarySearch(array,key_value); --> returns an index location
     *                        where the specific element is located,
     *                        returns the index location
     *                        key_value stands for what you are looking for
     *                        first we need to sort otherwise binarySearch doesn't work
     *                      * if the value is not in an array, it returns -(insertionIndex+1)
     *                    *** insertionIndex = index where the new value can be inserted if not present
     *                        in an array (
     *  - compare arrays -->  allows you to compare two arrays and check if they are equal
     *                        return true if they are equal, else return false
     *                        Arrays.equqls(array1,array2);
     *  - fill an array with specific value --> Allows you to fill the whole array with specific value
     *                        Arrays.fill(array1,value);
     *                                      --> Allows you to fill specific value between specific indexes
     *                        Arrays.fill(array1,fromIndex,toIndex,value);
     *  - copy an array to another array --> Allows you to copy one array to another array
     *                        Arrays.copyOf(array,length);
     *  - at Oracle website there are more methods but these are the most populars
     */

    public static void main(String[] args) {

        /**
         *   Arrays.toString examples
         */

//        double[] myArray = {1.0,2.0,3.0,4.0};
//        System.out.println(Arrays.toString(myArray));

//        int[] myArray = {49,36,100,81};
//        System.out.println(Arrays.toString(myArray));


        /**
         * Arrays.sort examples
         */

//        int[] myArray = {4,2,9,3,10,0,-6};
//        Arrays.sort(myArray);
//        System.out.println(Arrays.toString(myArray));

//        char[] myArray = {'a','z','f','b','x'}; // char tipinde sort yaparken karakterin unicode numarasina gore bakar
//        Arrays.sort(myArray);
//        System.out.println(Arrays.toString(myArray));

//        int[] myArray = {49,36,100,81,-100,-20,0,4};
//        System.out.println(Arrays.toString(myArray));
//        Arrays.sort(myArray);
//        System.out.println(Arrays.toString(myArray));

//        int[] array = {4,-2,9,3,10,0,-8};
//        Arrays.sort(array,4,7);
//        System.out.println(Arrays.toString(array));

//        int[] myArray = {49,36,100,81,-100,-20,0,4};
//        System.out.println(Arrays.toString(myArray));
//        Arrays.sort(myArray,2,5);
//        System.out.println(Arrays.toString(myArray));


        /**
         * Arrays.binarySearch example
         */

//        Integer[] myArray = {4,-2,9,3,10,0,-8}; // Integer is a class
//        Arrays.sort(myArray);
//        System.out.println(Arrays.toString(myArray));
//        int index = Arrays.binarySearch(myArray,9);
//        System.out.println("The value 9 is located at index: " + index);

//        int[] myArray = {49,36,100,81,-100,-20,0,4};
//        Arrays.sort(myArray);
//        System.out.println(Arrays.toString(myArray));
//        int index = Arrays.binarySearch(myArray,81);
//        System.out.println("Element 81 is located at index : " + index);

//          Integer[] myArray = {4,-2,0,9,3,10,-8};
//          Arrays.sort(myArray);
//          System.out.println(Arrays.toString(myArray));
//          int index = Arrays.binarySearch(myArray,1);
//          System.out.println("The element -10 is located at index : " + index);
          //istedigimiz degeri gercekte array e eklemiyoruz ama olsaydi nerede olurdu onu belirtiyoruz


        /**
         *  Arrays.equals example
         */

//           int[] myArray1 = {4,-2,9,3,10,0,-8};
//           int[] myArray2 = {4,-2,9,3,10,0,-8};
//           boolean isEqual = Arrays.equals(myArray1,myArray2); // boolean variable tanimladik cunku
                                                                 //true veya false donecek
//           if(isEqual){                                        // if(isEqual) = if(isEqual == true)
//               System.out.println("both arrays are equal");
//           }

//        int[] myArray1 = {49, 36,100,81,-100,-20,10,4};
//        int[] myArray2 = {49, 36,100,81,-100,-20,0,4};
//        boolean isEqual = Arrays.equals(myArray1,myArray2);
//        if(isEqual){
//            System.out.println("They are equal");
//        }
//        System.out.println("not equal");

        //that doesn't work
//        int[] myArray1 = {4, -2, 9, 3, 10, 0, -8};
//        int[] myArray2 = {4, -2, 9, 3, 10, 0, -8};
//        boolean isEqual = myArray1 == myArray2;
//        if(isEqual){
//            System.out.println("they are equal");
//        }

//        int[] myArray1 = {4, -2, 9, 3, 10, 0, -8};
//        int[] myArray2 = {4, -2, 9, 3, 10, 0, -8};
//        if(myArray1 == myArray2){   // that condition doesn't compare the arrays,
//                                    // compares the location of arrays in memory
//            System.out.println("they are equal");
//        }else{
//            System.out.println("They are not equal");
//        }

        /**
         *  Arrays.fill example
         */


//        int[] myArray1 = new int[10];
//        System.out.println("Before filling: " + Arrays.toString(myArray1));
//        Arrays.fill(myArray1,5);
//        System.out.println("After filling: " + Arrays.toString(myArray1));

//        int[] myArray = new int[10]; //default value olarak 10 adet 0 var
//        Arrays.fill(myArray,10); // array in elemanlarina 10 degeri ataniyor
//        System.out.println(Arrays.toString(myArray));

//        int[] myArray = new int[10];
//        System.out.println("Before filling: " + Arrays.toString(myArray));
//        //2. index den 6. indexe kadar degerler 5 olsun, 2 dahil 6 haric
//        Arrays.fill(myArray,2,6,5);
//        System.out.println("After filling: " + Arrays.toString(myArray));

        /**
         * Arrays.copyOf example
         */
//        int[] myArray = {1,20,30,40,50,9,10};
//        int[] copiedArray = Arrays.copyOf(myArray,5);
//        System.out.println(Arrays.toString(copiedArray));

//        int[] myArray = {2,100,20,30};
//        int[] myArray2 = myArray;
//        myArray2[3] = 90;
//        System.out.println(Arrays.toString(myArray));
//        System.out.println(Arrays.toString(myArray2));
        // both arrays are pointing the same place at the memory
        // so if you make a change on aone of them it affects the other
        // once kopyalarsak, (memory de farkli bir yer acar)
        // degisikligi sadece copied version da yapar

        int[] myArray = {2,100,20,30};
        int[] copyArray = Arrays.copyOf(myArray,8);
        copyArray[0] = 200;
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(copyArray));


















    }
}
