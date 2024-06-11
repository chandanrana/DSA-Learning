package geeksforgeeks;

import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWord(S));
    }

    private static String reverseWord(String s) {
        String[] arr = s.split("\\.");
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        int i = 0;
        String res = "";
        for (String str : arr) {
            res = res.concat(str);
            if (i++ != arr.length - 1) {
                res = res.concat(".");
            }
        }
        return res;
    }
}
