import java.sql.SQLOutput;
import java.util.Scanner;


public class RelationalOperators_2 {
    public static void main(String[] args){
    //int number1 = 3;
    //int number2 = 6;
    //boolean result = number1 == number2;
    // == checks equality, = assignes something
    //System.out.println(result);

//        int number1 = 3;
//        int number2 = 3;
//        boolean result = number1 != number2;
//         !=checks inequality
        //System.out.println(result);

        //int number1 = 3;
        //int number2 = 3;
        //boolean result = number1 < number2;
        //System.out.println(result);

        //int number1 = 3;
        //int number2 = 3;
        //boolean result = number1 <= number2;
        //System.out.println(result);

        //int number1 = 3;
        //int number2 = 3;
        //boolean result = number1 > number2;
        //System.out.println(result);

        //int number1 = 3;
        //int number2 =3;
        //boolean result = number1 >= number2;
        //System.out.println(result);

        //LOGICAL OPERATIONS

        // && means "and"
        //boolean aBoolean1 = true;
        //boolean aBoolean2 = true;
        //boolean result = aBoolean1 && aBoolean2;
        //System.out.println(result);

        // || means "or"
        //int aBoolean1 = false;
        //int aBoolean2 = true;
        //boolean result = aBoolean1 || aBoolean2;
        //System.out.println(result);

        // BITWISE OPEARTORS
        // a byte is 8 bits
        // & means "bitwise and"
//        int aNumber1 = 0;
//        int aNumber2 = 3;
//        int result = aNumber1 & aNumber2;
//        System.out.println(result);

//        int aNumber1 = 256;
//        byte aNumber2 = 0;
//        int result = aNumber1 & aNumber2;
//        System.out.println(result);
        //bitwise & kullaninca iki degerden biri 0 ise sonuc 0 olur

//        char aLetter = 'a';
//        byte aNumber2 = 1;
//        int result = aLetter & aNumber2;
//        System.out.println(result);

//        int aNumber1 =256;
//        int aNumber2 = 0;
//        int result = aNumber1 | aNumber2;
//        System.out.println(result);

//        int aNumber1 =256;
//        byte aNumber2 = 1;
//        int result = aNumber1 | aNumber2;
//        System.out.println(result);

//        char aLetter ='a';
//        byte aNumber2 = 0;
//        int result = aLetter | aNumber2;
//        System.out.println(result);

        // BITSHIFT OPERATORS
        // >> right shift
        // >> 1 ise divide by 2
        // >> 2 ise divide by 4
        // >>3 ise divide by 8
        // >>4 ise divide by 16 (2^4)

//        int aNumber1 = 256;
//        int result = aNumber1 >> 1;
//        System.out.println(result);

//        int aNumber1 = 256;
//        int result = aNumber1 >> 3;
//        System.out.println(result);

//        int aNumber1 = 256;
//        int result = aNumber1 << 1;
//        System.out.println(result);
        // <<n means multiplying by 2^n

        //GETTING USER INPUT

        //Scanner scanner = new Scanner(System.in);
        // system.in cunku disaridan bilgi girisi olacak
        //System.out.println("Hey, type your name please: ");
        //String myName = scanner.next();
        // allows you to type something
        // next() bir netoddur ve always returns string yani bosluktan sonrasini gormez
        // birkac kelime beraber yazdirmak istiyorsan nextLine() kullanmalisin
        //System.out.println("Your name is " + myName);

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old");


















    }
}
