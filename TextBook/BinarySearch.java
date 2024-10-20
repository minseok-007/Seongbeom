package TextBook;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 6, 1};
        Arrays.sort(arr);
        int target =  1;
        boolean isFound = false;
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if (arr[mid] == target) {
                System.out.println("Found");
                isFound = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!isFound) {
            System.out.println("Not found");
        }
    }
}

// O(logN)