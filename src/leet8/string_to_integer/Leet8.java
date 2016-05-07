package leet8.string_to_integer;

/**
 * Created by Administrator on 2016/4/26.
 */
public class Leet8 {

    public static void main(String[] args) {
        Leet8 l = new Leet8();
        String str = "1a";
        System.out.println(str);
        System.out.println(l.myAtoi(str));

    }

//    public int myAtoi(String str) {
//        if (str == null || str.length() == 0) return 0;
//        int result = 0;
//        char[] original = str.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        boolean isInit = false;
//        boolean isNegative = false;
//        for (int i = 0; i < original.length; i++) {
//            if(isInit) {
//                if (original[i] >= '0' && original[i] <= '9') {
//                    sb.append(original[i]);
//                } else {
//                    break;
//                }
//            }else{
//                if (original[i] == ' '){
//                    continue;
//                }
//                if (original[i] >= '0' && original[i] <= '9') {
//                    sb.append(original[i]);
//                }else{
//                    if (original[i] == '-') {
//                        sb.append(original[i]);
//                        isNegative = true;
//                    } else if (original[i] == '+') {
//                        sb.append(original[i]);
//                    } else {
//                        return 0;
//                    }
//                    sb.append('0');
//                }
//                isInit = true;
//            }
//        }
//
//        try{
//            result = Integer.parseInt(sb.toString());
//        } catch (NumberFormatException e) {
//            if (isNegative) {
//                result = Integer.MIN_VALUE;
//            } else {
//                result = Integer.MAX_VALUE;
//            }
//        }
//        return result;
//    }

    public int myAtoi(String str) {
        if (str == null || str.length() == 0) return 0;
        int result = 0;
        char[] original = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        boolean isInit = false;
        boolean isNegative = false;
        for (int i = 0; i < original.length; i++) {
            if (isInit) {
                if (original[i] >= '0' && original[i] <= '9') {
                    sb.append(original[i]);
                } else {
                    break;
                }
            } else {
                if (original[i] == ' ') {
                    continue;
                }
                if (original[i] >= '0' && original[i] <= '9') {
                    sb.append(original[i]);
                } else {
                    if (original[i] == '-') {
                        sb.append(original[i]);
                        isNegative = true;
                    } else if (original[i] == '+') {
                        sb.append(original[i]);
                    } else {
                        return 0;
                    }
                    sb.append('0');
                }
                isInit = true;
            }
        }

        try {
            result = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            if (isNegative) {
                result = Integer.MIN_VALUE;
            } else {
                result = Integer.MAX_VALUE;
            }
        }
        return result;
    }

}
