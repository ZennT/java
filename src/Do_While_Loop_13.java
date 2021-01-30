public class Do_While_Loop_13 {
    public static void main(String[] args) {
        // same as while loop but the statements inside the do block is run at least once
        //then the condition is checked
        //if the condition is true, it continues with the execution of the statements inside the do block
        //if the condition is false, it will exit the loop and continues with the program
        //SYNTAX       do {
        //                  Statements
        //             } while(condition);

//        int num = 0;                // initialization
//        do {
//            System.out.println(num);
//            num++;                  // increment
//        } while (num < 5);          // condition


//        int num = 1;
//        do {
//            System.out.println(num);
//            num++;
//        }while(num <= 10);

//        int num = 0;
//        int sum = 0;
//        do {
//            sum = sum + num;
//            num++;
//        }while(num <= 10);
//        System.out.println("The sum of the first 10 numbers is:" + sum);

//        int num = 10;
//        do{
//            System.out.println(num);
//            num++;
//        } while(num !=10);   // inifinite loop cunku bu condition always true

            // yukaridaki ornegin while hali
//        int num = 10;
//        while(num != 10);
//        {
//            System.out.println(num);
//            num++;
//        }

        int num = 10;
        do{
            System.out.println(num);
            num++;
        } while(num <= 10);


    }
}
