import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OccurrenceString {
    public static void main(String[] args) {
        String s = "java is an object oriented language";

        Long count = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals("a"))
                .findFirst()
                .get()
                .getValue();
        System.out.println("Count : " + count);


        Long a = IntStream.range(0, s.length())
                .mapToObj(i -> s.charAt(i))
                .filter(ch -> ch == 'a')
                .count();
        System.out.println(a);
    }
}
