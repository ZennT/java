import java.lang.reflect.Array;
import java.util.Arrays;

public class set_get_Array_18 {

    public static void main(String[] args) {

        // set Array METHOD
        // set Array Class method = Allows you to set specific values to specific index
        // Syntax = Array.set(Object[]array,int index, Object value)
        // set --> metod     Array --> class name

        String[] myStringArray = new String[3];
        myStringArray[0] = "Hi!";
        myStringArray[1] = "There";
        myStringArray[2] = "ozen";

        System.out.println(Arrays.toString(myStringArray));

          // yukaridaki ifadenin set metoduyla yazilmis hali
//        String[] myStringArray = new String[6];
//        Array.set(myStringArray,0,"Hi");
//        Array.set(myStringArray,1,"there");
//        Array.set(myStringArray,2,"how");
//        Array.set(myStringArray,3, "are");
//        Array.set(myStringArray,4, "you");
//        Array.set(myStringArray,5,"?");
//
//        System.out.println(Arrays.toString(myStringArray));


        int[] myArray = new int[5];

        Array.set(myArray,0,100);  // another way --> myArray[0] = 100;
        Array.set(myArray,1,81);
        Array.set(myArray,2,64);
        Array.set(myArray,3,49);
        Array.set(myArray,4, 36);

        System.out.println(Arrays.toString(myArray));








    }
}
