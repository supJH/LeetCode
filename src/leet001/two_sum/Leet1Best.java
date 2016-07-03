package leet001.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leet1Best{

	public static void main(String... args){
		Leet1 l = new Leet1();

		int[] nums = new int[]{2,7,11,15};	
		int[] a = l.twoSum(nums,9);
		System.out.println(Arrays.toString(a));

	}




	public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] ans = new int[2];
    for (int i = 0; i < nums.length; i++) {
        if (map.get(target-nums[i]) != null) {
            ans[0] = i;
            ans[1] = map.get(target-nums[i]);
            return ans;
        }
        map.put(nums[i],i);
    }
    return ans;
    }

}