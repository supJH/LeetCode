package leet28.implements_strStr;

/**
 * Created by Administrator on 2016/5/8.
 */
public class Leet28Best {

    //从第一个字母相同的开始，不断截短haystack
    public int strStr(String haystack, String needle) {
        if (needle.equals(haystack))
            return 0;
        if(needle.equals(""))return 0;
        if (haystack.toCharArray().length < needle.toCharArray().length)
            return -1;
        char[] c = needle.toCharArray();
        int loc = haystack.indexOf(c[0]);
        if (loc == -1)
            return -1;
        int i = loc;
        while (haystack.substring(loc).toCharArray().length >= c.length) {
            if (haystack.substring(loc, loc + c.length).equals(needle)) {
                return i;
            } else {
                haystack = haystack.substring(loc + 1);
                loc = haystack.indexOf(c[0]);
                if(loc==-1)return -1;
                i = i + loc + 1;
            }
        }
        return -1;
    }
}
