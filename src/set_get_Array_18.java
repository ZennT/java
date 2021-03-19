import java.lang.reflect.Array;
import java.util.Arrays;

public class set_get_Array_18 {

    public static void main(String[] args) {

        // set Array METHOD
        // set Array Class method = Allows you to set specific values to specific index
        // Syntax = Array.set(Object[]array,int index, Object value)
        // set --> metod     Array --> class name

//        String[] myStringArray = new String[3];
//        myStringArray[0] = "Hi!";
//        myStringArray[1] = "There";
//        myStringArray[2] = "ozen";
//
//        System.out.println(Arrays.toString(myStringArray));

          // yukaridaki ifadenin set metoduyla yazilmis hali
//        String[] myStringArray = new String[6]; // bu satirda yanlislikla
//                                                   new String[5] yazdigim icin hata aldim
//                                                   ArrayIndexOutOfBoundsException is thrown
//                                                   to indicate that we are trying to access
//                                                   array element with an illegal index.
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
//        System.out.println(Arrays.toString(myStringArray));



//        int[] myArray = new int[5];
//
//        Array.set(myArray,0,100);  // another way --> myArray[0] = 100;
//        Array.set(myArray,1,81);
//        Array.set(myArray,2,64);
//        Array.set(myArray,3,49);
//        Array.set(myArray,4, 36);
//
//        System.out.println(Arrays.toString(myArray));

         // getArray METHOD
         //get Array Class method = Allows you to return the value at a specific index
         //Syntax = Array.get(Object [], int index)

        int[] myArray = {2,4,6,8};
        for(int i = 0; i < myArray.length; i++){
            int storeValue =(int) Array.get(myArray,i);
            System.out.println("The value at " + i + " index is: " + storeValue);
        }






    }
}
