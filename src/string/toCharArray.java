package string;

/**
 * converts the string to a char array
 * Syntax: stringName.toCharArray();
 */

public class toCharArray {
    public static void main(String[] args) {
        String coronaName = "Coronavirus";
        char[] coronaChar = coronaName.toCharArray();
        for(char corona: coronaChar){
            System.out.println(corona);
        }
    }
}
