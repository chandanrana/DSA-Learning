import java.util.Arrays;

public class GFG_Max_Min {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 4, 1, 9 };
		System.out.println(findMaxAndMin(arr));
	}

	private static int[] findMaxAndMin(int[] arr) {
		Arrays.sort(arr);
		return new int[] { arr[0], arr[arr.length] };
	}
}
