package leet78.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/4/21.
 */
public class Leet78 {
    public static void main(String[] args) {
        Leet78 l = new Leet78();
        int[] nums = new int[]{1, 3, 2};
        List<List<Integer>> lists = l.subsets(nums);

        List<Integer> list = null;
        Iterator<List<Integer>> iter = lists.iterator();
        while (iter.hasNext()) {
            list = iter.next();
            System.out.println(Arrays.toString(list.toArray()));
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        Arrays.sort(nums);

        for(int i = 0 ;i < nums.length; i++){
            int size = lists.size();
            for(int j = 0;j < size;j++){
                List<Integer> list = new ArrayList<>(lists.get(j));
                list.add(nums[i]);
                lists.add(list);
            }
        }
        return lists;
    }

}
