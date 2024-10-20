package HW2;

public class Fibonacci {
    // 1 1 2 3 5
    public static void main(String[] args) {
        int[] arr = fibonacci(5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] fibonacci(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        if (n > 2) {
            fibonacciHelper(fibonacci, n, 2);
        }

        return fibonacci;
    }

    public static void fibonacciHelper(int[] fibonacci, int n, int index) {
        if (index >= n) return;

        fibonacci[index] = fibonacci[index - 1] + fibonacci[index - 2];

        fibonacciHelper(fibonacci, n, index + 1);
    }






}
