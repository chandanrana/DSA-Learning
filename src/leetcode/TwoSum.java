package leetcode;

import java.util.Arrays;

public class TwoSum {
    private static int[] targetSumIndices(int[] nums, int target) {
        if(nums.length == 0) {
            return new int[] {-1, -1};
        }
        int len = nums.length - 1;
        int next = 0;
        int i=1;
        while(i <= len) {
            if(nums[i] + nums[next] == target) {
                return new int[] {i, next};
            }
            if(i == len) {
                next++;
                i++;
            }
            i++;
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] res = targetSumIndices(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
