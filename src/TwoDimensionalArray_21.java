import java.util.Arrays;

public class TwoDimensionalArray_21 {
    /**
     * What is 2 - D Array?
     * 1 - D Array means an array in a row
     * In 2 -D Array there is a column and a row
     * Each row is an element of 2 -D array
     * (elements of the array are array itself)
     * 2 - D is an Array inside an array
     */
    public static void main(String[] args) {
        /**
         * initialize a 2 -D array
         */
//        int[][] twoDimArray = {
//                {3, 5, 7, 5, 2, 7, 5, 9, 1, 8},
//                {5, 9, 8, 7, 6, 4, 2, 1, 0, 1},
//                {7, 7, 9, 4, 2, 6, 1, 3, 9, 0}
//        };
//        System.out.println("The first row is : " + Arrays.toString(twoDimArray[0])); // 2 - D array in 0 indexli elemani
//        System.out.println("The element on 1st row and 5th column is : " + twoDimArray[0][4]); // 2 - D array in specific bir elemani
//        System.out.println("The element on 3st row and 2th column is : " + twoDimArray[2][1]);

        /**
         * another way os initializing
         */
//        int[][] twoDimArray = new int[3][3];
//        twoDimArray[0][0] = 3;
//        twoDimArray[1][1] = 3;
//        twoDimArray[2][2] = 3;
//        for(int i = 0; i < twoDimArray.length; i++){
//            System.out.println(Arrays.toString(twoDimArray[i]));
//        }
//
//        int[][] twoDimArray = new int[3][3];
//        twoDimArray[0][0] = 3;
//        twoDimArray[1][1] = 4;
//        twoDimArray[2][2] = 5;
//        System.out.println(Arrays.toString(twoDimArray)); // this print gives the location on the memory
//        // for loop butun arrayi dolasir
//        for(int i = 0; i < twoDimArray.length; i++){
//            System.out.println(Arrays.toString(twoDimArray[i]));
//        }

//        int[][] twoDimArray = {
//                {1, 2},
//                {3, 5},
//                {8, 3},
//                {7, 4}
//        };
//        System.out.println(twoDimArray[2][2]); //Array index out of bound hatasi verir
//                                               //2. satir var ama sutun yok

        /**
         * jagged Array
         */
//        int[][] twoDimArray = {
//                {1, 2, 5, 9, 10},
//                {3, 5},
//                {8},
//                {7, 4, 9}
//        };

        int[][] twoDimArray = {
                {1, 2, 5},
                {3},
                {8, 4, 5, 7, 7},
                {7, 4}
        };
        for(int i = 0; i < twoDimArray.length; i++){
            System.out.println(Arrays.toString(twoDimArray[i]));
        }






        }
}
