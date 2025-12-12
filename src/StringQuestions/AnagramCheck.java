package StringQuestions;

import java.util.Arrays;

public class AnagramCheck {

    //Anagrams have the same characters in different order (e.g., "listen" and "silent").
    //Approach: Remove spaces, convert both to lowercase char arrays,
    //          Arrays.sort() both arrays, and then compare them using Arrays.equals().
    public static void main(String[] args) {

        System.out.println("Anagram Check");

        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isAnagrams(str1, str2));

    }

    public static boolean isAnagrams(String str1, String str2){
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        if(s1.length() != s2.length()){
            return false;
        }

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

    }
}
