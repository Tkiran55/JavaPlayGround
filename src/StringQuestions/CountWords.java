package StringQuestions;

public class CountWords {

    public static void main(String[] args) {
        System.out.println("Counting numbers of words");

        String str = " Java is Great ";

        //split the words and store in array
        String[] words = str.trim().split("\\s+");

        System.out.println(words.length);

    }
}
