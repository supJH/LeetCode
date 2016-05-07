package leet7.reverse_int;

/**
 * Created by Administrator on 2016/4/2.
 */
public class Leet7Best {

    public static void main(String[] args) {
        Leet7Best l = new Leet7Best();
        int result = l.reverse(1534236469);
        System.out.println(result);
    }

    public int reverse(int x){
        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0: (int) res;
    }


}
