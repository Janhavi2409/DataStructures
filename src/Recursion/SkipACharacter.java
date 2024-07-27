package Recursion;

public class SkipACharacter {
    public static String skipAChar(String unprocessed, char character) {
        if (unprocessed.isEmpty()) {
            return "";
        }

        char ch = unprocessed.charAt(0);
        if (ch == character) {
            return skipAChar(unprocessed.substring(1), character);
        } else {
            return ch + skipAChar(unprocessed.substring(1), character);
        }
    }

    public static void main(String[] args) {
        System.out.println("Processed String: " + skipAChar("abracadabra", 'a'));
    }
}
