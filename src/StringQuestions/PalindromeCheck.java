package StringQuestions;

public class PalindromeCheck {
    //A palindrome reads the same backward as forward (e.g., "madam").
    //Approach: Reverse the string and check if original.equals(reversed).

    static String reversed;

    public static boolean isPalindrome(String str) {

        System.out.println("Original word: " + str);
        StringBuilder stringBuilder = new StringBuilder(str);
        reversed = stringBuilder.reverse().toString();
        System.out.println("Reversed word: " + reversed);

        return str.equals(reversed);
    }

    public static void main(String[] args) {


        System.out.println("Palindrome Check");

        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("madam"));


    }
}
