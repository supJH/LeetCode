package leet7.reverse_int;

public class Leet7 {

    public static void main(String[] args) {
        Leet7 l = new Leet7();
        int result = l.reverse(1534236469);
        System.out.println(result);
    }


    public int reverse(int x) {
        int positiveFlag = 0;
        if (x < 0) {
            positiveFlag = 1;
        }
        char[] nums = (x + "").toCharArray();
        StringBuffer sb = new StringBuffer();
        if (positiveFlag == 1) {
            sb.append("-");
        }
        for (int i = nums.length - 1; i >= positiveFlag; i--) {
            sb.append(nums[i]);
        }

        int result = 0;
        try {
            result = Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {
//            e.printStackTrace();
        }
        return result;
    }

}
