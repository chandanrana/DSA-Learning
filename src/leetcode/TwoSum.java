package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    private static int[] twoSumBruitForce(int[] numbers, int target) {
        if (numbers.length == 0) return new int[]{};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    private static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> cacheMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (cacheMap.containsKey(target - numbers[i])) {
                return new int[]{cacheMap.get(target - numbers[i]), i};
            }
            cacheMap.put(numbers[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 5, 11};
        int target = 10;
        int[] res = twoSum(numbers, target);
        System.out.println(Arrays.toString(res));
    }
}
