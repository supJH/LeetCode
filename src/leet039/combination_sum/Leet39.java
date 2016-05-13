package leet039.combination_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/24.
 */
public class Leet39 {
    public static void main(String[] args) {
        Leet39 l = new Leet39();
        int[] candidates = new int[]{3, 2, 6, 7, 1};
        List<List<Integer>> results = l.combinationSum(candidates, 7);

        for (List<Integer> list : results) {
            System.out.println(Arrays.toString(list.toArray()));
        }


    }

//    public List<List<Integer>> combinationSum(int[] candidates, int target) {

//        List<List<Integer>> results = new ArrayList<>();
//        if (candidates == null) return results;
//        List<List<Integer>> intermediate = new ArrayList<>();
//
//        Arrays.sort(candidates);
//
//        for (int i = 0; i < candidates.length; i++) {
//            List<List<Integer>> temp = new ArrayList<>();
//            int nums = target / candidates[i];
//            List<Integer> list = new ArrayList<>();
//            list.add(0);
//            for (int j = 0; j < nums; j++) {
//                list = new ArrayList<>(list);
//
//                list.add(candidates[i]);
//                list.set(0, list.get(0) + candidates[i]);
//                if (list.get(0) == target) results.add(new ArrayList<>(list.subList(1, list.size())));
//                temp.add(list);
//            }
//            if (intermediate.size() < 1) {
//                intermediate.addAll(temp);
//            } else {
//                for (int k = 0; k < intermediate.size(); ) {
//
//
//                    for (List<Integer> tempList : temp) {
//                        List<Integer> interList = new ArrayList<>(intermediate.get(k));
//                        int sum = tempList.get(0) + interList.get(0);
//                        interList.addAll(tempList.subList(1, tempList.size()));
//                        interList.set(0, sum);
//                        if (sum == target) {
//                            results.add(new ArrayList<>(interList.subList(1, interList.size())));
//                        }
//                        if (sum > target) {
//                            intermediate.remove(interList);
//                            break;
//                        }
//
//                        k++;
//
//                    }
//
//
//                }
//            }
//
//
//        }
//
//
//        return results;
//    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new LinkedList<>();

        List<List<Integer>> temp = new ArrayList<>();
        temp.add(new ArrayList<Integer>() {{
            add(0);
        }});

        for (int i = candidates.length -1 ; i >= 0 ; i--) {
            for (int k = 0; k < temp.size(); k++) {
                List<Integer> list = new LinkedList<>(temp.get(k));
                list.add(1,candidates[i]);
                list.set(0, list.get(0) + candidates[i]);
                if (list.get(0) == target) {
                    result.add(0,list.subList(1, list.size()));
                } else if (list.get(0) < target){
                    temp.add(list);
                }
            }
        }
        return result;
    }

}
