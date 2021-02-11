public class Break_Continue_14 {
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

//            int num = 10;
//            do {
//                System.out.println(num);
//                num++;
//                if(num == 20){
//                    break;
//                }
//            }while(num ==10);   //sadece 10 yazdiriyor
//             //while(num!=10);  // 10-19 arasini yazdiriyor

//        -------------------------------------------

/*               CONTINUE
        if you want to skip certain things you can use continue

 */

//        int num = 0;
//        while (num < 5){
//            num++;
//            if (num == 3){
//                continue;   // bu condition i skip et
//            }
//            System.out.println(num);
//        }

//        int num = 1;
//        while (num <=10){
//            num++;
//            if(num == 5){
//                continue;
//            }
//            System.out.println(num);
//        }

//

//        int num = 1;
//        while (num <= 10) {
//            num++;
//            if (num == 5) {
//                continue;
//            }
//            System.out.println(num);
//        }  // 2 den baslayip 5 i atlayip 11 e kadar yazdiriyor

        int num = 1;
        do {
            num = num + 2;
            if(num == 7){
                continue;
            }
            System.out.println(num);
        }while (num <= 20);
        // 7 yi yazdirmaz cunku continue dan dolayi num == 7 oldugunda alttaki system.out satirini atlar
        // 21 de yazdirir cunku while daki condition i num i yazdirdiktan sonra kontrol ediyor

    }
}
