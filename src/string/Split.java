package string;

/**
 * splits the string according to the string passed
 * Syntax : stringName.split(String anotherString)
 */

public class Split {
    public static void main(String[] args) {
        String name = "Welcome to CodingBook Academy";
        String[] wordSplit = name.split(" ");

        for(String word: wordSplit){
            System.out.println(word);
        }
    }
}
