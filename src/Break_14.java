public class Break_14 {
    public static void main(String[] args) {
        /*
        BREAK
        exit the switch statement, while, do-while and for loop
        the rest of the program continues to run
         */

//        int num = 0;
//        while (num < 5){
//            num++;
//            if  (num == 3){ // bu condition saglandiginda loop dan cikar
//                break;
//            }
//            System.out.println(num);
//        }

//        int num = 0;
//        while (num <= 10){
//            num++;
//            if(num == 7) {
//                break;
//            }
//            System.out.println(num);
//        }


        int num = 1;
        while(true) {
            if(num > 10) {
                break;
            }
            System.out.println(num);
            num++;

        }
    }
}
