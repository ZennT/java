package string;

/**
 * Returns the string representation of any data type.
 * In other words, convert any data type to string
 * Syntax: String.valueOf(dataType name);
 */

public class ValueOf {
    public static void main(String[] args) {
        int studentID = 333444555;
        String idString = String.valueOf(studentID);
        System.out.println(idString);
    }
}
