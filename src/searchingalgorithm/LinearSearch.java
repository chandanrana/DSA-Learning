package searchingalgorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 13, 53, 63, 23, 35, 27};
        int ele = 27;
        System.out.println(search(arr, ele));

        String str = "Chandan";
        System.out.println(searchInString(str, 'a'));
    }

    static int search(int[] arr, int ele) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i + 1;
            }
        }
        return -1;
    }

    static int searchInString(String str, char target) {
        char[] strArr = str.toCharArray();
        for (int index = 0; index < strArr.length; index++) {
            if (strArr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
