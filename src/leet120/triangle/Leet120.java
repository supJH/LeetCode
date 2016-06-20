package leet120.triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/2.
 */
public class Leet120 {
    public static void main(String... args) {

        List<Integer> list1 = new ArrayList<Integer>() {{
            add(2);
        }};
        List<Integer> list2 = new ArrayList<Integer>() {{
            add(3);
            add(4);
        }};
        List<Integer> list3 = new ArrayList<Integer>() {{
            add(6);
            add(5);
            add(7);
        }};
        List<Integer> list4 = new ArrayList<Integer>() {{
            add(4);
            add(1);
            add(8);
            add(3);
        }};

        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);


        Leet120 l = new Leet120();
        int min = l.minimumTotal(lists);
        System.out.println(min);
    }


    public int minimumTotal(List<List<Integer>> triangle) {

        final int maxRow = triangle.size();
        final int size = (maxRow + 1) * maxRow / 2;
        int[] pre = new int[size];

        pre[0] = triangle.get(0).get(0);
        int minimumTotal = pre[0];

        int index = 1;
        int preMin;
        for (int i = 1; i < maxRow; i++) {
            List<Integer> list = triangle.get(i);
            int rowSize = list.size();
            int preChoosed = list.get(0) + pre[index - rowSize + 1];
            for (int j = 0; j < rowSize; j++, index++) {
                preMin = j == 0 ? pre[index - rowSize + 1] : (j == rowSize - 1) ? pre[index - rowSize] : Math.min(pre[index - rowSize + 1], pre[index - rowSize]);
                pre[index] = preMin + list.get(j);
                preChoosed = minimumTotal = Math.min(preChoosed, pre[index]);
            }
        }
        return minimumTotal;
    }

}
