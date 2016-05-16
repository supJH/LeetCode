package leet009.palindrome_number;

/**
 * Created by Administrator on 2016/5/16.
 */
public class Leet9 {

    public static void main(String[] args) {
        Leet9 l = new Leet9();
        System.out.println(l.isPalindrome(2));
    }


    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int ans = 0;
        int num = x;
        while ( num > 0) {
            ans = ans * 10 + num % 10;
            num = num / 10;
        }
        if (ans != x) return false;
        return true;
    }


}
