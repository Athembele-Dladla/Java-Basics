public class StringManipulation {
    public static void main(String[] args) {
        String message = "hello, Aphiwe";

        // System.out.println(message.charAt(0));
        // System.out.println(message.charAt(1));

        System.out.println(message.trim());          // remove leading and trailing whitespace
        System.out.println(message.toLowerCase());   // convert all characters to lowercase
        System.out.println(java.util.Arrays.toString(message.split(","))); // split string by comma
        System.out.println(message.length());        // length of string
    }
}
