package leet137.single_number_II;

//The usual bit manipulation code is bit hard to get and replicate.
//I like to think about the number in 32 bits and just count how many 1s are there in each bit,
// and sum %= 3 will clear it once it reaches 3. After running for all the numbers for each bit,
// if we have a 1, then that 1 belongs to the single number, we can simply move it back to its spot by doing ans |= sum << i;
//
//This has complexity of O(32n), which is essentially O(n) and very easy to think and implement.
// Plus, you get a general solution for any times of occurrence. Say all the numbers have 5 times,
// just do sum %= 5.


public class Leet137Best {
//    public int singleNumber(int[] nums) {
//        int ans = 0;
//        for(int i = 0; i < 32; i++) {
//            int sum = 0;
//            for(int j = 0; j < nums.length; j++) {
//                if(((nums[j] >> i) & 1) == 1) {
//                    sum++;
//                    sum %= 3;
//                }
//            }
//            if(sum != 0) {
//                ans |= sum << i;
//            }
//        }
//        return ans;
//    }


//    https://leetcode.com/discuss/54970/an-general-way-to-handle-all-this-sort-of-questions

    public int singleNumber(int[] nums) {
        //we need to implement a tree-time counter(base 3) that if a bit appears three time ,it will be zero.
        //#curent  income  ouput
        //# ab      c/c       ab/ab
        //# 00      1/0       01/00
        //# 01      1/0       10/01
        //# 10      1/0       00/10
        // a=~abc+a~b~c;
        // b=~a~bc+~ab~c;
        int a=0;
        int b=0;
        for(int c:nums){
            int ta=(~a&b&c)|(a&~b&~c);
            b=(~a&~b&c)|(~a&b&~c);
            a=ta;
        }
        //we need find the number that is 01,10 => 1, 00 => 0.
        return a|b;

    }

}
