package leet028.implements_strStr;

/**
 * Created by Administrator on 2016/5/8.
 */
public class Leet28 {

    public static void main(String[] args) {
        Leet28 l = new Leet28();
        System.out.println(l.strStr("aabca", "bc"));

    }


    public int strStr(String haystack, String needle) {
        if (haystack == null  || needle == null) return -1;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            boolean isFind = true;
            int k = i;
            for (int j = 0; j < needle.length(); j++, k++) {
                if (haystack.charAt(k) != needle.charAt(j)) {
                    isFind = false;
                    break;
                }
            }
            if (isFind) return i;
        }
        return -1;
    }
}
