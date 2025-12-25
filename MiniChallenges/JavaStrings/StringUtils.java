package JavaStrings;

public class StringUtils {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int countVowels(String str) {

        int count = 0;
        str = str.toLowerCase();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;

    }

    public static boolean isPalindrome(String str) {
        String str1 = str.replaceAll("\\s", "").toLowerCase();

        StringBuilder sb = new StringBuilder(str1);
        String reversed = sb.reverse().toString();

        return str1.equals(reversed);
    }

    public static String capitalizeWords(String str) {
        String[] words = str.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.reverseString("Hello"));

        System.out.println(StringUtils.countVowels("Hello World"));

        System.out.println(StringUtils.isPalindrome("A man a plan a canal Panama"));

        System.out.println(StringUtils.capitalizeWords("hello world from java"));
    }
}
