package leet258.add_digits;

/**
 * Created by Administrator on 2016/6/20.
 */
public class Leet258Best {
    public int addDigits(int num) {
        //from https://en.wikipedia.org/wiki/Digital_root
        return (num-1)%9+1;
    }

}
