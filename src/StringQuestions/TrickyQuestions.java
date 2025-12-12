package StringQuestions;

public class TrickyQuestions {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2); //false (One is in Heap, one is in Pool).
        System.out.println(s1.equals(s2)); //true (Content is the same).

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4); //true
        //Reason: Both literals point to the exact same object in the String Pool.

        //What is the difference between equals() and ==?
        //Answer:
        //== compares references (memory addresses). It checks if two variables point to the exact same object.
        //equals() compares content (values). It checks if the characters inside the String are identical.
        //Tip: Always use .equals() to compare String text.
    }
}
