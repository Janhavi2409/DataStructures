package Recursion;

public class SkipAString {

    public static String skipAStr(String unprocessed, String skip) {
        if (unprocessed.isEmpty()) {
            return "";
        }
        if (unprocessed.startsWith(skip)) {
            return skipAStr(unprocessed.substring(skip.length()), skip);
        }
        return unprocessed.charAt(0) + skipAStr(unprocessed.substring(1), skip);
    }

    public static void main(String[] args) {
        System.out.println("Processed String: " + skipAStr("abraapplecadabra", "apple"));
    }
}
