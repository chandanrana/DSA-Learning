package geeksforgeeks;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        rotateEff(arr, k); // TIME COMPLEXITY O(n)
//        rotate(arr, k); // TIME COMPLEXITY : k*n
    }

    // Efficient Approach
    private static void rotateEff(int[] arr, int k) {
        k = (k > 0)? k%arr.length : k+arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Naive Approach - Bruteforce
    private static void rotate(int[] arr, int k) {
        k = k % arr.length;
        if(k < 0) {
            k = k+arr.length;
        }

        for (int i=0; i<k; i++) {
            rotateOnce(arr);
        }
    }

    private static void rotateOnce(int[] arr) {
        // keep the first element in temp
        int temp = arr[0];
        // iterate from 1 till size and shift each element back to its previous pos
        for(int i=1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        // assign the temp element at last pos
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
