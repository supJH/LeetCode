package leet013.roman_to_integer;

/**
 * Created by Administrator on 2016/5/17.
 */

/*        Given a roman numeral, convert it to an integer.

        Input is guaranteed to be within the range from 1 to 3999.*/

public class Leet13 {

    public static void main(String[] args) {
        Leet13 l = new Leet13();
        System.out.println(l.romanToInt("MDCCCLXXXIV"));
    }


    public int romanToInt(String s) {
        int[] roman  = {1,5,10,50,100,500,1000};
        int sum = 0;
        int preIndex = 0;
        int currentIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    currentIndex = 0;
                    break;
                case 'V':
                    currentIndex = 1;
                    break;
                case 'X':
                    currentIndex = 2;
                    break;
                case 'L':
                    currentIndex = 3;
                    break;
                case 'C':
                    currentIndex = 4;
                    break;
                case 'D':
                    currentIndex = 5;
                    break;
                case 'M':
                    currentIndex = 6;
                    break;
                default:
                    break;
            }
            sum += roman[currentIndex];
            if (preIndex < currentIndex && i != 0) {
                sum -= 2 * roman[preIndex];
            }
            preIndex = currentIndex;
        }
        return sum;
    }


}
