package leet014.longest_common_prefix;

/**
 * Created by Administrator on 2016/5/19.
 */

//Write a function to find the longest common prefix string amongst an array of strings.

public class Leet14 {

    public static void main(String[] args) {

        Leet14 l = new Leet14();
        String[] strs = {"aaa", "aa", "aaa"};
        String result = l.longestCommonPrefix(strs);
        System.out.println(result);

    }


    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0].length() == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        int j = 1;
        String prefix = strs[0].substring(0, j);
        int i = 0;
        while (true) {
            if (j <= strs[i].length()) {
                if (!strs[i].substring(0, j).equals(prefix)) {
                    return strs[i].substring(0, j - 1);
                }
            } else {
                return strs[i].substring(0, j - 1);
            }

            if (i == strs.length - 1) {
                j++;
                if (j <= strs[i].length()) {
                    prefix = strs[i].substring(0, j);
                }
                i = -1;
            }
            i++;
        }
    }

//    public String longestCommonPrefix2(String[] strs) {
//        if (strs == null || strs.length == 0) {
//            return "";
//        } else if (strs.length == 1) {
//            return strs[0];
//        }
//        int j = 1;
//
//        String prefix = "";
//        if (j <= strs[0].length()) {
//            prefix = strs[0].substring(0, j);
//        } else {
//            return "";
//        }
//
//        for (int i = 0; i < strs.length; i++) {
//            if
//        }
//
//
//    }

}
