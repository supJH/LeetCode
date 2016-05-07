package leet263.ugly_number;

/**
 * Created by Administrator on 2016/4/2.
 */
public class Leet263Best {

    public static void main(String[] args) {
        Leet263 l = new Leet263();
        long start = System.currentTimeMillis();
        boolean flag = l.isUgly(8);
//        System.out.println(flag);
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }



    public  boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }

        int[] divisors = {2, 3, 5};

        for(int d : divisors) {
            while (num % d == 0) {
                num /= d;
            }
        }
        return num == 1;
    }




}
