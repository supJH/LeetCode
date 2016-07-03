package leet050.pow;

/**
 * Implement pow(x, n).
 * <p>
 * Created by Administrator on 2016/6/22.
 */
public class Leet50 {

    public static void main(String[] args) {
        Leet50 l = new Leet50();
//        double result = l.myPow(0.00001, 2147483647);
        double result = l.myPow(2, 10);
        System.out.print(result);
    }

//    public double myPow(double x, int n) {
//        double result = 1.0f;
////        for (int i = 0; i < n; i++) {
////            result *= x;
////        }
//        boolean isPositive = false;
//        if (n < 0) {
//            isPositive = true;
//            n = -n;
//        } else if (n == 0) {
//            return 1;
//        }
//
////        for(int i = 0; i < n ;i++){
////            result *= x;
////        }
//        int index = 1;
//
//        while(){
//            if(index <= n){
//                index = index << 1;
//                if(index == 2){
//                    result *= x;
//                }else{
//                    result *= result;
//                }
//            }else{
//
//            }
//        }
//
//
//        if (isPositive) {
//            return 1 / result;
//        }
//        return result;
//    }

    public double myPow(double x, int n) {
        boolean isExpNegative = false;
        double result = 0.0d;
        if (n < 0) {
            isExpNegative = true;
            n = -n;
        }
        result = pow(x, n);
        if (isExpNegative) return 1/result;
        return result;
    }

    public double pow(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        }
        double result = pow(base, exponent >> 1);
        result *= result;
        if ((exponent & 0x1) == 1)
            result *= base;
        return result;

    }
}
