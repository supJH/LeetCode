package leet344.reverse_string;

import leet187.repeated_dna_seq.Leet187;

/**
 * Created by Administrator on 2016/4/24.
 */
public class Leet344 {

    public static void main(String[] args){
        Leet344 l = new Leet344();
        String result = l.reverseString("ÖÐ¹ú");
        System.out.println(result);


    }

//    public String reverseString(String s) {
//        StringBuilder sb = new StringBuilder();
//        int codePoint = s.codePointCount(0,s.length());
//
//        for(int i = codePoint-1; i>= 0;i--){
//            sb.append(Character.toChars(s.codePointAt(i)));
//        }
//        return sb.toString();
//    }

//    public String reverseString(String s) {
//        StringBuilder sb = new StringBuilder();
//        for(int i = s.length()-1; i>= 0;i--){
//            sb.append(s.charAt(i));
//        }
//        return sb.toString();
//    }

    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = chars.length-1; i>= 0;i--){
            sb.append(chars[i]);
        }
        return sb.toString();
    }

}
