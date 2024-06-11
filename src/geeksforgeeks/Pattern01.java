package geeksforgeeks;

/*
n = 3

3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1

 */

public class Pattern01 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            int k = n * (n - i);
            int m = n;
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < n - i; l++) {
                    if (m > 0) {
                        System.out.print(m + " ");
                    }
                }
                m--;
            }
            System.out.print("\n");
        }
    }
}
