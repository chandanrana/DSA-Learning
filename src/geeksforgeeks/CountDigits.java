package geeksforgeeks;

// https://www.geeksforgeeks.org/problems/count-digits5716/1?page=1&difficulty=School&sortBy=submissions

public class CountDigits {
    public static void main(String[] args) {
        int N = 22074;
        System.out.println(countDigits(N));
    }

    private static int countDigits(int N) {
        int count = 0;
        int num = N;
        while(num > 0) {
            int rem = num % 10;
            if(rem > 0 && (N % rem) == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}