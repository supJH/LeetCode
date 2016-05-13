package leet005.Longest_Palindromic_Substring;

/**
 * Created by Administrator on 2016/4/22.
 */
public class Leet5 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Leet5 l = new Leet5();
//        String s = "aabaaidvsrcv";
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        String result = l.longestPalindrome(s);

        long end = System.currentTimeMillis();
        System.out.println(result);

        System.out.println(end - start);
    }


    public String longestPalindrome(String s) {
        int length = s.length();
        char[] c = s.toCharArray();
        for (int i = length; i > 0; i--) {
            for (int j = 0; j <= length - i; j++) {
                boolean isPalindrome = true;
                for (int k = j; k <= j + i / 2; k++) {
                    if (c[k] != c[i + 2 * j - 1 - k]) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) return s.substring(j, j + i);
            }
        }

        return null;
    }

//    public String longestPalindrome(String s) {
//        char[] c = s.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for (int i = c.length - 1; i >= 0; i--) {
//            sb.append(c[i]);
//        }
//        String reverseStr = sb.toString();
//
//        int length = s.length();
//        for (int i = length; i > 0; i--) {
//            for (int j = 0; j <= length - i; j++) {
//                String result = s.substring(j, j + i);
//                if (result.equals(reverseStr.substring(length - j - i, length - j)))
//                    return result;
//            }
//        }
//        return null;
//    }
}
