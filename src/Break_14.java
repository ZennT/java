public class Break_14 {
    public static void main(String[] args) {
        /*
        BREAK
        exit the switch statement, while, do-while and for loop
        the rest of the program continues to run
        if the condition is always true it is good to use break
         */

//        int num = 0;
//        while (num < 5){
//            num++;
//            if  (num == 3){ // bu condition saglandiginda loop dan cikar
//                break;
//            }
//            System.out.println(num);
//        }
//         --------------------------------
//        int num = 0;
//        while (num <= 10){
//            num++;
//            if(num == 7) {
//                break;
//            }
//            System.out.println(num);
//        }
//      ----------------------------------------

//        int num = 1;
//        while(true) {
//            if(num > 10) {
//                break; // eger break olmazsa condition true oldugu icin hep calisir
//            }
//            System.out.println(num);
//            num++;
//    }

//      ------------------------------------------

            int num = 10;
            do {
                System.out.println(num);
                num++;
                if(num == 20){
                    break;
                }
            }while(num ==10);   //sadece 10 yazdiriyor
             //while(num!=10);  // 10-19 arasini yazdiriyor




    }
}
