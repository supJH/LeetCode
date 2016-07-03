package leet038.count_and_say;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * <p>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * <p>
 * Created by Administrator on 2016/6/20.
 */
public class Leet38 {
    public static void main(String... args) {
        Leet38 l = new Leet38();
        String result = l.countAndSay(6);
        System.out.print(result);
    }

    public String countAndSay(int n) {
        String result = "1";
        if (n < 2) {
            return result;
        }
        int i = 0;
        while (i < n - 1) {
            result = count(result);
            i++;
        }

        return result;
    }

    public String count(String start) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
//        if (start.length() == 1) return "11";
        for (int i = 0; i < start.length(); i++) {
            if (i == 0) {
                count = 1;
            } else {
                if (start.charAt(i) == start.charAt(i - 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(start.charAt(i - 1) + "");
                    count = 1;
                }
            }
            if (i == start.length() - 1) {
                sb.append(count);
                sb.append(start.charAt(i) + "");
            }
        }

        return sb.toString();
    }


}
