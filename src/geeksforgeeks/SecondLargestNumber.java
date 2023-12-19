package geeksforgeeks;

public class SecondLargestNumber {
    private static int secondLargest(int[] arr, int n) {
        int fLarge = Integer.MIN_VALUE;
        int sLarge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i] > fLarge){
                sLarge = fLarge;
                fLarge = arr[i];
            }
            if(arr[i] < fLarge && arr[i] > sLarge) {
                sLarge = arr[i];
            }
        }
        return sLarge;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int secondLargest = secondLargest(arr, arr.length);
        System.out.println("Second Largest : "+ secondLargest);
    }
}
