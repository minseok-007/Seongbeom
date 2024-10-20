package TextBook;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 6, 1};
        int target =  10;
        boolean isFound = false;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " is found at position " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println(target +  " is not found.");
        }
    }
}

// O(n)
