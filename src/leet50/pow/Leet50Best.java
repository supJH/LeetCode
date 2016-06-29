package leet50.pow;

/**
 * Created by Administrator on 2016/6/22.
 */
public class Leet50Best {
    public static void main(String[] args) {
        Leet50Best l = new Leet50Best();
//        double result = l.myPow(0.00001, 2147483647);
        double result = l.myPow(2, 10);
        System.out.print(result);
    }


    public double myPow(double x, int n) {
        double ans = 1;
        for (long i = Math.abs((long) n); i > 0; i = i >> 1, x *= x){
            System.out.println(i & 1);
            if ((i & 1) == 1) ans *= x;
        }
        return n > 0 ? ans : 1 / ans;
    }

}
