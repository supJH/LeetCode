package leet001.two_sum;

import java.util.*;

public class Leet1{

	public static void main(String... args){
		Leet1 l = new Leet1();

		int[] nums = new int[]{2,7,11,15};	
		int[] a = l.twoSum(nums,9);
		System.out.println(Arrays.toString(a));

	}




	public int[] twoSum(int[] nums, int target) {
       for(int i = 0;i < nums.length;i++){
       		for(int j = i+1;j < nums.length;j++){
       			if(nums[i] + nums[j] == target){
       				return new int[]{i,j};
       			}
       		}
       }
       return new int[2];
    }

}