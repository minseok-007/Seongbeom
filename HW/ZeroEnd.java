package HW;

public class ZeroEnd {
    public static void main(String[] args) {}
    int[] nums1 = {0,1,0,3,12};
    int[] nums2 = {0};

    moveZeros(nums1);
    moveZeros(nums2);

        System.out.println(nums1);
        System.out.println(nums2);
}
