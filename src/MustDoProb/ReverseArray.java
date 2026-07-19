package MustDoProb;

import java.util.Arrays;

public class ReverseArray {
    // Removed 'int n' since arr.length gives us everything we need
    static void rev(int ...arr){
        int l = arr.length;
        int mid = Math.floorDiv(l, 2);

        for (int i = 0; i < mid; i++) {
            // 1. Save the front element
            int temp = arr[i];

            // 2. Move the back element to the front position
            arr[i] = arr[l - i - 1];

            // 3. Move the saved front element to the back position
            arr[l - i - 1] = temp;
        }

        // Print the reversed array elements directly from inside the method
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Pass the elements to reverse
        rev(6, 8, 9, 7);
    }
}