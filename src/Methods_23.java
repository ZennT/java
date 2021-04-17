import java.util.Scanner;

public class Methods_23 {
    /**
     * if the whole program is inside main method it causes a long code
     * which is hard to read and understand
     *  sample code:
     *             public class HugeProgram{
     *             public static void main(String[] args) {
     *                 doSomething1();
     *                 doSomething2();
     *             }
     *             public static void doSomething1(){ -->burasi metodun tanimlandigi yer
     *                 System.out.println("Hello");   --> metodun cagrildigi yer
     *             }
     *             public static void doSomething2(){
     *                 System.out.println("World!");
     *             }
     *         }
     *         public[or private] returnType
     *         methodName(type1 name1,......typeN nameN){
     *             Body
     *         }
     *         to define a method -->
     *         1.decide between public and private
     *         2. give it a name
     *         3. specify the types of parameters and give them names
     *         4. specify the method's return type or choose void  // void olursa return yapmaz
     *         5. write the mwthod's code
     *
     *         a method returnd a value of the specified type unless
     *         it is declared void; the return type can be any primitive data type or a class type.
     *         a method's parameters can be of any primitive data types or class types.
     *
     *         public[or private] retuenType methodName()--> empty parentheses indicate that
     *         a method takes no parameters
     *
     *         PRINCIPLES
     *         A method name starts with a lowercase letter
     *         Method names often sound like verbs
     *         The name of a method that returns the value of a field often starts with get:
     *         getWidth, getX
     *         The name of a method that sets the value of a field starts with set:
     *         setLocation, setText
     */


//    public static void main(String[] args) {
//        System.out.println(mrSum(5,6));
//    }
//    public static int mrSum(int a, int b){
//        return a+b;
//    }


//    public class Example{
//        public static void main(String[] args) {
//            printSomething();
//        }
//        public static void printSomething(){
//            System.out.println("Hello World!");
//        }
//    }

//    public class Example{
//        public static void main(String[] args) {
//            int maxNumber = max(5, 10);
//            System.out.println(maxNumber);
//        }
//        public static int max(int a, int b){
//            if(a > b)
//                return a;
//            else
//                return b;
//        }
//    }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter City");
            String city = scan.next();
            System.out.println("Enter Name");
            String name = scan.next();
            greeting(name, city);
        }
        public static void greeting(String n, String c){
            System.out.println("Hello " + n + " from " + c);
        }


}
