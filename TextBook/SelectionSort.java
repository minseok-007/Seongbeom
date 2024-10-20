package TextBook;

public class SelectionSort {

    public static void main(String[] args) {
        int [] arr = { 5,7,6,1,4,2,3};
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }


        }
    }
}

