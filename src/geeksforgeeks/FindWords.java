package geeksforgeeks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindWords {

    public static void main(String[] args) {
        List<String> words = List.of("abc", "mnm", "xlx", "xyz", "fkf", "qew");
        System.out.println(Arrays.toString(findWords(words).toArray()));
    }

    private static List<String> findWords(List<String> words) {
        return words.stream()
                .filter(str -> str.charAt(0) == str.charAt(str.length() - 1))
                .collect(Collectors.toList());
    }
}
