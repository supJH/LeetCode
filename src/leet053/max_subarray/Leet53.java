package leet053.max_subarray;

/**
 * Created by Administrator on 2016/4/2.
 */
public class Leet53 {

    public static void main(String... args) {
        Leet53 l = new Leet53();
        int[] nums = new int[]{-1,1,2};
        System.out.println(l.maxSubArray(nums));

    }

    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int pre = 0;

        for (int i = 0; i < nums.length; i++) {
            if(pre < 0){
                pre = nums[i];
            }else{
                pre += nums[i];
            }
            if(pre > max) max = pre;
        }
        return max;
    }


}
