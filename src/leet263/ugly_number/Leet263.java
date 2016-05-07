package leet263.ugly_number;

/**
 * Created by Administrator on 2016/4/2.
 */
public class Leet263 {
    public static void main(String[] args) {
        Leet263 l = new Leet263();

//        long start = System.currentTimeMillis();
        boolean flag = l.isUgly(13253246);
        System.out.println(flag);
//        long end = System.currentTimeMillis();
//        System.out.println(end-start);
    }

    public boolean isUgly(int num) {
        boolean uglyFlag = false;
        while(true){
            int originalNum = num;
            num = num % 2 == 0 ? num / 2 : num;
            num = num % 3 == 0 ? num / 3 : num;
            num = num % 5 == 0 ? num / 5 : num;
            if(num == originalNum) break;
        }
        if(num == 1){
            uglyFlag = true;
        }
        return uglyFlag;
    }
}
