package ArraysQuestions;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

                // Given sorted arrays
                int[] array1 = {1, 3, 5, 7};
                int[] array2 = {2, 4, 6, 8};

                // Determine the total size for the new array
                int size1 = array1.length;
                int size2 = array2.length;

                // Create the merged array with the combined size
                int[] mergedArray = new int[size1 + size2];

                // Three pointers:
                int ptr1 = 0; // Pointer for array1 (i)
                int ptr2 = 0; // Pointer for array2 (j)
                int ptrM = 0; // Pointer for mergedArray (k)

                System.out.println("## 🔀 Merging Sorted Arrays");
                System.out.println("Array 1: " + Arrays.toString(array1));
                System.out.println("Array 2: " + Arrays.toString(array2));
                System.out.println("---");


                // 1. Loop while both arrays still have elements to compare
                while (ptr1 < size1 && ptr2 < size2) {

                    // Compare the elements at the current pointers
                    if (array1[ptr1] < array2[ptr2]) {
                        // If array1 element is smaller, place it in the merged array
                        mergedArray[ptrM] = array1[ptr1];
                        ptr1++; // Move array1 pointer forward
                    } else {
                        // Otherwise, place the element from array2
                        mergedArray[ptrM] = array2[ptr2];
                        ptr2++; // Move array2 pointer forward
                    }
                    ptrM++; // Always move the merged array pointer forward
                }

                // 2. Add remaining elements from array1 (if any)
                while (ptr1 < size1) {
                    mergedArray[ptrM] = array1[ptr1];
                    ptr1++;
                    ptrM++;
                }

                // 3. Add remaining elements from array2 (if any)
                while (ptr2 < size2) {
                    mergedArray[ptrM] = array2[ptr2];
                    ptr2++;
                    ptrM++;
                }

                // Print the result
                System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
            }


}
