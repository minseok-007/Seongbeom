package HW;

public class MissingNum {
    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int exsum = n * (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        System.out.println(exsum - sum);
    }
}
