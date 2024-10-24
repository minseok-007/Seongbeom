package HW1;

public class ZeroEnd {
    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {0};

        moveZeros(nums1);
        moveZeros(nums2);

        System.out.println(java.util.Arrays.toString(nums1));
        System.out.println(java.util.Arrays.toString(nums2));
    }

    public static void moveZeros(int[] nums) {
        int location = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[location] = nums[i];
                location++;
            }
        }

        for (int i = location; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
