package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sum {

    public static void main(String[] args) {
//        int n = 10;
        List<Integer> numList = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9);
        int evenSum = evenSum(numList);
        System.out.println("EVEN SUM : " + evenSum);

        int oddSum = oddSum(numList);
        System.out.println("ODD SUM : " + oddSum);

        Map<Boolean, List<Integer>> oddEvenNums = numList.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        for (Map.Entry<Boolean, List<Integer>> entry : oddEvenNums.entrySet()) {
            System.out.println("KEY  : " + entry.getKey());
            System.out.println("VALUE : " + Arrays.toString(entry.getValue().toArray()));
        }
    }

    private static int oddSum(List<Integer> numList) {
        return numList.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(num -> num)
                .sum();
    }

    private static int evenSum(List<Integer> numList) {
        return numList.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num)
                .sum();
    }


}
