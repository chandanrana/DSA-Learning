import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview {

    public static void main(String[] args) {
        String str = "Hello World";
//        System.out.println(frequentChar(str));

        String value = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((prev, next) -> (int) (next.getValue() - prev.getValue()))
                .findFirst()
                .get()
                .getKey();
        System.out.println(value);
    }

    private static char frequentChar(String str) {
        char result = ' ';
        Map<Character, Integer> frequencyCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) { // k
            frequencyCountMap.put(ch, frequencyCountMap.getOrDefault(ch, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (Integer value : frequencyCountMap.values()) {
            if (value > max) {
                max = value;
            }
        }

        for (Map.Entry<Character, Integer> entry : frequencyCountMap.entrySet()) {
            if (entry.getValue() == max) {
                result = entry.getKey();
            }
        }
        return result;
    }
}
