package leet198.house_robber;

/**
 * Created by Administrator on 2016/4/2.
 */
public class Leet198Best {

    public static void main(String[] args) {
        Leet198Best l = new Leet198Best();

        int robbedMoney = l.rob(new int[]{8,10,2,1,7,20,5} );
        System.out.println(robbedMoney);
    }


    public int rob(int[] nums) {
// If we get invalid input, return 0
        if (nums == null || nums.length == 0) return 0;

        // Keep track of whether or not we robbed the previous house
        int robbedPrevious = 0;
        int didNotRobPrevious = 0;

        for (int i = 0; i < nums.length; i++) {

            // If we don't rob the current house, take the max of robbing and not robbing the previous house
            int currentNotRobbed = Math.max(robbedPrevious, didNotRobPrevious);

            // If we rob the current house, add the current money robbed to what we got from not robbing previous
            int currentIsRobbed = didNotRobPrevious + nums[i];

            // Update our values for the next iteration
            didNotRobPrevious = currentNotRobbed;
            robbedPrevious = currentIsRobbed;
        }

        // Return the maximum we could have robbed provided we looked at both options
        return Math.max(robbedPrevious, didNotRobPrevious);
    }

}
