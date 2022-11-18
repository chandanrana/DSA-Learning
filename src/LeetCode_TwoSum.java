import java.util.Arrays;

/*
https://leetcode.com/problems/two-sum/
 */
public class LeetCode_TwoSum {
    public static void main(String[] args) {
        int[] arr = {4, 12, 4, 2, 19, 2, 20, 15};
        int k = 24;
        System.out.println(Arrays.toString(findPair(arr, k)));
    }

    private static int[] findPair(int[] arr, int k) {
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int value = arr[start] + arr[end];
            if (value > k) {
                end--;
            } else {
                start++;
            }
            if (value == k) {
                return new int[]{arr[start], arr[end]};
            }
        }
        return new int[]{};
    }
}
