package leet229.majority_element_II;

import leet198.house_robber.Leet198Best;

import java.util.*;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * The algorithm should run in linear time and in O(1) space.
 * <p>
 * Created by Administrator on 2016/6/23.
 */
public class Leet229 {
    public static void main(String[] args) {
        Leet229 l = new Leet229();

        List<Integer> result = l.majorityElement(new int[]{1, 2});
        System.out.println(result.toString());
    }


    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums == null) return null;
        if (nums.length == 1) {
            result.add(nums[0]);
        } else if (nums.length == 2) {
            result.add(nums[0]);
            if (nums[0] != nums[1]) {
                result.add(nums[1]);
            }
        } else {
            Map<Integer, Integer> map = new HashMap<>();
            int threshold = nums.length / 3;
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    if (map.get(nums[i]) <= threshold) {
                        map.put(nums[i], map.get(nums[i]) + 1);
                        if (map.get(nums[i]) > threshold) {
                            result.add(nums[i]);
                            if (result.size() == 2) {
                                return result;
                            }
                        }
                    }
                } else {
                    map.put(nums[i], 1);
                }
            }
        }
        return result;
    }
}
