import java.util.Scanner;

public class Array_example_12 {
    public static void main(String[] args) {
        /*
        define an array of type double of size 10
        use the scanner class to ask user to enter 10 numbers in a while loop
        store those values in the array
        find the average of the array
        if you don't define the members of the array, java assumes that it is empty
         */

//        int[] my_array = new int[]{1,2,3,4};  // array tanimladim, size(buyukluk) belirtseydim koseli parantez icine yazardim.
//        System.out.println(my_array[0]);      // array imin 0. elemanini yazdirdim

//        int[] my_array = new int[4];            //array in sadece size ini belirttim//
//        System.out.println(my_array[3]);

//        double[] doubleValues = new double[10];  // define an array
//        int i = 0;
//        double sum = 0;
//        double average = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 10 numbers to get the average:");
//        while(i < doubleValues.length){
//            doubleValues[i] = scanner.nextDouble();
//            sum = sum + doubleValues[i];
//            i++;
//        }
//        average = sum/doubleValues.length;
//        System.out.println("The average is:" + average);

        //----------------------------------------

//        Scanner scanner = new Scanner(System.in);
//        double[] array = new double[10];
//        for(int n = 0; n < array.length; n++)
//        {
//            System.out.println("Enter #" + (n + 1));
//            double num = scanner.nextDouble();
//            array[n] = num;
//        }
//        double sum = 0;
//        for(int x = 0; x < array.length; x++)
//        {
//            sum += array[x];
//        }
//        double avg;
//        avg = sum / array.length;
//        System.out.println(avg);


//        String[] my_array = new String[]{"hello","world","!"};
//        for (int i = 0; i<my_array.length; i++){
//            System.out.println(my_array[i]);
//        }

        int[] my_array = new int[]{1,5,8};
        for(int i = 0; i<my_array.length; i++){
            //0, 1, 2 --> eleman siralamasi
           System.out.println(my_array[i]);
           // bu ornekte println for loop disina yazamiyoruz
        }





    }
}
