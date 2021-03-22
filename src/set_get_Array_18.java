import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * set Array METHOD
 *  set Array Class method = Allows you to set specific values to specific index
 *  Syntax = Array.set(Object[]array,int index, Object value)
 *  set --> method     Array --> class name
 */

public class set_get_Array_18 {

    public static void main(String[] args) {



//        String[] myStringArray = new String[3];
//        myStringArray[0] = "Hi!";
//        myStringArray[1] = "There";
//        myStringArray[2] = "ozen";
//
//        System.out.println(Arrays.toString(myStringArray));

          // yukaridaki ifadenin set metoduyla yazilmis hali
//        String[] myStringArray = new String[6]; // bu satirda yanlislikla
//                                                   new String[5] yazdigim icin hata aldim
//                                                   "ArrayIndexOutOfBoundsException is thrown
//                                                   to indicate that we are trying to access
//                                                   array element with an illegal index."
//                                                   This exception is thrown when the index is
//                                                   either negative or greater than or equal to
//                                                   the size of the array.

//        Array.set(myStringArray,0,"Hi");
//        Array.set(myStringArray,1,"there");
//        Array.set(myStringArray,2,"how");
//        Array.set(myStringArray,3, "are");
//        Array.set(myStringArray,4, "you");
//        Array.set(myStringArray,5,"?");
//
//        System.out.println(Arrays.toString(myStringArray));    //



        int[] myArray = new int[5];

        Array.set(myArray,0,100);  // another way as shown above --> myArray[0] = 100;
        Array.set(myArray,1,81);
        Array.set(myArray,2,64);
        Array.set(myArray,3,49);
        Array.set(myArray,4, 36);

//        int getValue = Array.get(myArray,3);  //--> Array onune int yazmadigimiz icin object
                                                    // farzediyor. (int) yazarak tipini belirlemeliyiz
                                                    // bu type casting ornegidir
        int getValue = (int)Array.get(myArray,3);
        System.out.println("The value at index 3 is : " + getValue);

//        System.out.println(Arrays.toString(myArray));

        /**
         * java.lang.reflect.Array -->
         * The Array class provides static methods to dynamically create and access Java arrays.
         *
         * java.util.Arrays -->
         * This class contains various methods for manipulating arrays (such as sorting and searching).
         * This class also contains a static factory that allows arrays to be viewed as lists.
         * Utility class,which contains static methods to manipulate(sort,max,min etc.) the values stored in array.
         */

        /**
         * getArray METHOD
         * get Array Class method = Allows you to return the value at a specific index
         * Syntax = Array.get(Object [], int index)
         */

//        int[] myArray = {2,4,6,8};
//        for(int i = 0; i < myArray.length; i++){
//            int storageValue =(int) Array.get(myArray,i);
//            System.out.println("The value at " + i + " index is: " + storageValue);
//        }

          // similar code
//        int[] myArray = {2,4,6,8};
//        for(int i = 0; i < myArray.length; i++){
//            int storeValue = myArray[i];
//            System.out.println("The value at " + i + " index is " + storeValue);
//        }







    }
}
