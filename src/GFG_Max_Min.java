import java.util.Arrays;

// https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
public class GFG_Max_Min {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        System.out.println(Arrays.toString(findMaxMin(arr)));
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Maximum: " + findMax(arr));
    }

    private static int[] findMaxMin(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < min) {
                min = arr[index];
            }
        }
        return min;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }
}
