package string;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please type in what size of coffee you want");
//        System.out.println("Small, Medium or Large");
//        String choice = scanner.nextLine();
//        switch(choice.toLowerCase()){
//            case "small":
//                System.out.println("You selected Small");
//                break;
//            case "medium":
//                System.out.println("You selected Medium");
//                break;
//            case "large":
//                System.out.println("You selected Large");
//                break;
//            default:
//                System.out.println("Invalid choice");
//                break;
//        }



//        String message = "I will see you at 8:00 AM";
//        System.out.println(message.toUpperCase());


        String firstStr = "CodingBook";
        String secondStr = "CodingBook";
        String thirdStr = new String("CodingBook");

        if(firstStr == secondStr){
            System.out.println("firstStr = secondStr");
        }else {
            System.out.println("firstStr != secondStr");
        }
        if(firstStr.equals(thirdStr)){               // --> (firstStr == thirdStr) yazarsak esit degil sonucunu veriyor
                                                     // cunku initialiation  farkli yapilmis. new kullanildiginda sadece deger atamiyor
                                                     // new ile initialization yapilmissa, icindeki string degeri karsilastirabilmek icin  .equals kullanilmali
            System.out.println("firstStr = thirdStr");
        }else{
            System.out.println("firstStr != thirdStr");
        }


    }
}
