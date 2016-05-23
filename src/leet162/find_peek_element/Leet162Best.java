package leet162.find_peek_element;

/**
 * Created by Administrator on 2016/5/23.
 */
public class Leet162Best {

    public static void main(String[] args) {
        Leet162Best l = new Leet162Best();
        int[] nums = {1, 2, 3, 1};
        int result = l.findPeakElement(nums);
        System.out.println(result);
    }

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < nums[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
