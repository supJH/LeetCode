package leet191.number_1_bit;

/**
 * Created by Administrator on 2016/4/9.
 */
public class Leet191 {

    public static void main(String[] args) {
        Leet191 l = new Leet191();
        int result = l.hammingWeight(-1);
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(-1 ^ (-2147483648));
        System.out.println(result);

    }

    public int hammingWeight(int n) {
        int weight = 0;
        if (n < 0) {
            n = n ^ (-2147483648);
            weight++;
        }
        while (n != 0) {
            if (n % 2 != 0) {
                weight++;
            }
            n = n / 2;
        }
        return weight;
    }


}
