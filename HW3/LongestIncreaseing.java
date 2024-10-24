package HW3;

public class LongestIncreaseing {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7, 8, 10};

        if (nums.length == 0) {
            System.out.println(0);

            int maxlength = 1;
            int currentlength = 1;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    currentlength++;
                } else {
                    maxlength = Math.max(maxlength, currentlength);
                    currentlength = 1;
                }
            }
            System.out.println(maxlength);
        }
    }
}
