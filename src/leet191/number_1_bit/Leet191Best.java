package leet191.number_1_bit;

/**
 * Created by Administrator on 2016/4/9.
 */
public class Leet191Best {

    public static void main(String[] args) {
        Leet191Best l = new Leet191Best();
        int result = l.hammingWeight(-1);
        System.out.println(result);

    }

    public int hammingWeight(int n) {
        int i = 0;
        while(n!=0) {
            n&= n-1;
            i++;
        }
        return i;
    }
}
