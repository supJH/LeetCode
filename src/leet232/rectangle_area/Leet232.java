package leet232.rectangle_area;

/**
 * Created by Administrator on 2016/6/22.
 */
public class Leet232 {
    public static void main(String... args) {
        Leet232 l = new Leet232();
        int result = l.computeArea(0, 0, 0, 0, -1, -1, 1, 1);
        System.out.print(result);
    }


    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

        if(E > C || G < A || F > D || H < B){
            return (C - A) * (D - B) + (G - E) * (H - F) ;
        }else{
            int width = Math.min(C, G) - Math.max(A, E);
            int high = Math.min(D, H) - Math.max(F, B);
            return (C - A) * (D - B) + (G - E) * (H - F) - width * high;

        }
    }
}
