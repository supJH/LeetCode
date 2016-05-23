package leet162.find_peek_element;

/*A peak element is an element that is greater than its neighbors.
Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
You may imagine that num[-1] = num[n] = -∞.
For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.*/
public class Leet162 {

    public static void main(String[] args) {
        Leet162 l = new Leet162();
        int[] nums = {1, 2};
        int result = l.findPeakElement(nums);
        System.out.println(result);
    }


    public int findPeakElement(int[] nums) {

        if (nums == null) return 0;
        for (int i = 0; i < nums.length; i++) {
            int pre = i < 1 ? Integer.MIN_VALUE : nums[i - 1];
            int after = i == nums.length - 1 ? Integer.MIN_VALUE : nums[i + 1];
            if (nums[i] > pre && nums[i] > after) {
                return i;
            }
        }
        return 0;

    }
}
