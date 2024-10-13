package HW;

public class FindCloseNum {
    public static void main(String[] args) {
        int[] array = {3, 8, 15, 17, 9, 5, 6, 11};
        .sort(array);

        int num1 = 0;
        int num2 = 0;
        int miniDifference = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]);

            if (diff < miniDifference) {
                miniDifference = diff;
                num1 = array[i];
                num2 = array[i + 1];
            }
        }
        System.out.println(num1 + " , " +num2);
        System.out.println(miniDifference);
    }
}
