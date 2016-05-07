package leet6.zigzag_conversion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/25.
 */
public class Leet6 {

    public static void main(String[] args){
        Leet6 l = new Leet6();
        String result = l.convert("PAYPALISHIRING",3);

        System.out.println(result);

    }

    public String convert(String s, int numRows) {
        if(numRows <= 1) return  s;
        char[] originStr = s.toCharArray();
        char[] newStr = new char[originStr.length];

        List<List<Character>> result = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++){
            result.add(new ArrayList<Character>());
        }
        int groupNums = 2 * numRows -2;
        for(int i = 0 ;i < originStr.length;i++){
            int seqNum = i % groupNums;
            if( seqNum < numRows ) {
                result.get(seqNum).add(originStr[i]);
            }else {
                result.get(numRows - 2 - seqNum % numRows).add(originStr[i]);
            }
        }
        int i = 0;
        for (List<Character> list : result){
            for (Character c : list){
                newStr[i] = c;
                i++;
            }
        }
        return new String(newStr);
    }

//    public String convert(String s, int numRows) {
//        char[] originStr = s.toCharArray();
//        char[][] newStr = new char[numRows][];
//        int groupNums = 2 * numRows -2;
//        for(int i = 0 ; i < numRows ; i++){
//            int groups = originStr.length / groupNums;
//            int lastGroupNum = originStr.length % groupNums;
//
//            newStr[i] = new char[originStr];
//        }
//
//        for(int i = 0 ;i < originStr.length;i++){
//            int seqNum = i % groupNums;
//            if( seqNum < numRows ) {
//                newStr[seqNum][newStr[seqNum].length] = originStr[i];
//            }else {
//                newStr[numRows - 2 - seqNum % numRows][newStr[numRows - 2 - seqNum % numRows].length]=originStr[i];
//            }
//        }
//        return newStr.toString();
//    }


}
