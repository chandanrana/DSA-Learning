# DSA Learning

## Binary Search Algorithm

### Notes

- Binary search is applicable with the sorted array.
- Time complexity
    - Best case : O(n), If element found in first comparison that is if middle element is the target element.
    - Average case: O(logn)
    - Worst case : O(logn), If we have to keep reducing the search space till it has only one space.

### Steps

- In case of order agnostic search, We can check if array is in ascending order or descending order. You can skip it
  otherwise.
    - `boolean isAsc = arr[start] < arr[end];`
- Find the middle element in the array.
    - `int mid = start + (end - start) / 2;`
- If target element is greater than middle element then search in the right else search in left.
    - `if (target < arr[mid]) { end = mid - 1; } else { start = mid + 1; }`
- If middle element is the rarget element then answer is middle.
    - `if (target == arr[mid]) { return mid; }`

_**Note: Order agnostic** means we don't know if the array is sorted in ascending or descending order._