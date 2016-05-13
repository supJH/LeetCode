package leet006.zigzag_conversion;

/**
 * Created by Administrator on 2016/4/25.
 */
public class Leet6Best {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder builder = new StringBuilder();
        int adder = 2*numRows-2;
        for (int i=0; i<s.length(); i+=adder) {
            builder.append(s.charAt(i));
        }
        for (int i=1; i<numRows-1; ++i) {
            int j=i;
            while(j<s.length()) {
                builder.append(s.charAt(j));
                int next = 2*numRows-2*i-2+j;
                if (next < s.length())
                    builder.append(s.charAt(next));
                else {
                    break;
                }
                j += adder;
            }
        }
        for (int i=numRows-1; i<s.length(); i+=adder) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}
