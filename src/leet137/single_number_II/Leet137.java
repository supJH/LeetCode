package leet137.single_number_II;


import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, every element appears three times except for one. Find that single one.
 *
 * Created by Administrator on 2016/6/29.
 */
public class Leet137 {
    public static void main(String[] args) {
        Leet137 l = new Leet137();
        int[] nums = {2,1, 3, 4};
        int result = l.singleNumber(nums);
        System.out.print(result);
    }

    public int singleNumber(int[] nums) {
        if (nums == null || nums.length < 1){
            return -1;
        }
        Set<Integer> result = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if(!temp.contains(nums[i])){
                result.add(nums[i]);
                temp.add(nums[i]);
            }else{
                if(result.contains(nums[i])){
                    result.remove(nums[i]);
                }
            }
        }
        return result.iterator().next();

    }


}
