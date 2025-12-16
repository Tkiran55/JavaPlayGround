package StringQuestions;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println("--Reverse a String--");

        String str = "hello";
        System.out.println("Original word: " + str);

        String reversed = "";

        // char array and iterate   
        char[] characters = str.toCharArray();

        for(int i=characters.length-1; i>=0 ;i--) {
            reversed = reversed + characters[i];
        }
        System.out.print("Reversed word: " + reversed);

        System.out.println();

        //using StringBuilder class (Best Way)
        StringBuilder stringBuilder = new StringBuilder(str);
        String reversedWord = stringBuilder.reverse().toString();
        System.out.println(reversedWord);

    }
}
