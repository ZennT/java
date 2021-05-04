package string;

/**
 * checks if the string contains specific sequence of characters
 * return true, if it does, else return false
 * Syntax: stringName.contains(String another String)
 */

public class Contains {
    public static void main(String[] args) {
        String fullname = "CodingBook Academy";
        if(fullname.contains("Academy")){
            System.out.println("This is a certified academy");
        }else{
            System.out.println("This is not an academy");
        }

    }
}
