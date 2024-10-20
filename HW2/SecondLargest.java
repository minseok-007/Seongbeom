package HW2;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {5,2,8,1,6,9};
        int largest = 0;
        int secondLargest = 0;

        for (int number : arr) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        System.out.println(secondLargest);
    }

//    public static int findSecondLargest(int[] numbers) {
//        int largest = 0;
//        int secondLargest = 0;
//
//        for (int number : numbers) {
//            if (number > largest) {
//                secondLargest = largest;
//                largest = number;
//            } else if (number > secondLargest && number < largest) {
//                secondLargest = number;
//            }
//        }
//
//        return secondLargest;
//    }
}
