package leet120.triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/2.
 */
public class Leet120Best {
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

        List<List<Integer>> lists = new ArrayList<List<Integer>>() {{
            add(list1);
            add(list2);
            add(list3);
            add(list4);
        }};


        Leet120Best l = new Leet120Best();
        int min = l.minimumTotal(lists);
        System.out.println(min);
    }


    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0)
            return 0;
        if (triangle.size() == 1)
            return triangle.get(0).get(0);

        int[] dp = new int[triangle.size()];
        dp[0] = triangle.get(0).get(0);
        return minimumTotal(triangle, dp, 1);
    }

    public int minimumTotal(List<List<Integer>> triangle, int[] dp, int lvlidx) {
        /**
         * dp: dp[i]_lvlidx = the min path sum up to current level and up to
         * index i
         *
         * dp[0]_lvlidx = this_level_list[0] + dp[0]_(lvlidx-1);
         * dp[end]_lvlidx = this_level_list[end] + dp[end-1]_(lvlidx-1);
         *
         * dp[i]_lvlidx = this_level_list[i] + min{ dp[i-1]_(lvlidx-1),
         * dp[i]_(lvlidx-1) };
         */

        List<Integer> list = triangle.get(lvlidx);
        int pre = dp[0], temp;
        dp[0] += list.get(0);
        for (int i = 1; i < lvlidx; i++) {
            temp = dp[i];
            dp[i] = list.get(i) + Math.min(pre, dp[i]);
            pre = temp;
        }
        dp[lvlidx] = pre + list.get(lvlidx);

        if (lvlidx + 1 == triangle.size()) {
            int res = dp[0];
            for (int i = 1; i <= lvlidx; i++)
                res = Math.min(res, dp[i]);
            return res;
        }

        return minimumTotal(triangle, dp, lvlidx + 1);
    }

}
