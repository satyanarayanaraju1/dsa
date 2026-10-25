package sorting;

import java.util.Arrays;

public class BubbleSort {
    // Bringing the big bubble to the end in the array by size
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 3, -6, 9, 11};

        for (int i = 0; i < arr.length - 1; i++) { // Genrally O(n2)
            boolean swap = false; // Because of this first iteration will test the array sorted or not, so O(n)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
