package ArraysQuestions;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] dataArray = {1, 2, 3, 2, 4, 2, 5, 2, 6};

        // 2. The target number to count
        int targetNumber = 2;

        // Initialize a counter variable
        int count = 0;

        // Print the array and target for context
        System.out.println("## 🔍 Counting Occurrences");
        System.out.print("Array: {");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + (i < dataArray.length - 1 ? ", " : ""));
        }
        System.out.println("}");
        System.out.println("Target Number: " + targetNumber);
        System.out.println("---");

        // 3. Iterate through the array and count
        // We use a basic for loop or an enhanced for loop (for-each)

        for (int element : dataArray) {
            // Check if the current element matches the target number
            if (element == targetNumber) {
                // If it matches, increment the counter
                count++;
            }
        }

        // 4. Print the final result
        System.out.println("The number " + targetNumber + " appears " + count + " times.");
    }
}
