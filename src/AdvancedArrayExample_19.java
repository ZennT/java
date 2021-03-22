public class AdvancedArrayExample_19 {

    public static void main(String[] args) {
        /**
         * EXAMPLE WITH for loop
         * Create an array and
         * find the square root of each element using for loop
         * Hint : Use Math.sqrt method
         */

        int[] array = {49, 36, 100, 81};

        for(int i = 0; i < array.length; i++){
            double sqrt = Math.sqrt(array[i]);    // bu satirda squareroot metodunu cagirdik
                                                  // loop her dondugunde her eleman icin bu metodu kullanacak
                                                  // double tanimladik cunku bu metod double kabul ediyor
                                                  // squareroot decimal bir sayi olabilir
            System.out.println("The square root of " + array[i] + " is " + sqrt);

        }


    }
}
