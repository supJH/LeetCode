package leet258.add_digits;

 /*Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 For example:

 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

 Follow up:
 Could you do it without any loop/recursion in O(1) runtime?

 Created by Administrator on 2016/6/20.*/

public class Leet258 {
    public static void main(String[] args) {
        Leet258 l = new Leet258();
        int result = l.addDigits(38);
        System.out.print(result);
    }

    public int addDigits(int num) {
        int result = 0;
        while (num > 0 ) {
            result += num % 10;
            num = num / 10;
        }
        if (result > 9) {
            return addDigits(result);
        } else {
            return result;
        }
    }

}




