package string;

/**
 * replace a specific character in the string with another character
 * Syntax : stringName.replace(char oldChar, char newChar)
 */
public class Replace {
    public static void main(String[] args) {
        String session = "You all are doing great in this session.";
        System.out.println(session);
        String  newSession = session.replace('i', 'u');
        System.out.println(newSession);
    }
}
