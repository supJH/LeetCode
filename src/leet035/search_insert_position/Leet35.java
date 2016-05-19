package leet035.search_insert_position;

/**
 * Created by Administrator on 2016/5/19.
 */

/*Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

        You may assume no duplicates in the array.

        Here are few examples.
        [1,3,5,6], 5 → 2
        [1,3,5,6], 2 → 1
        [1,3,5,6], 7 → 4
        [1,3,5,6], 0 → 0*/


public class Leet35 {
    public static void main(String[] args) {
        Leet35 l = new Leet35();
        int[] nums = {1, 3, 5, 6};

        int result = l.searchInsert(nums, 7);
        System.out.println(result);

    }


    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return low;
    }

}
