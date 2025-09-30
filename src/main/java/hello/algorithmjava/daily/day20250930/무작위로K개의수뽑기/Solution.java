package hello.algorithmjava.daily.day20250930.무작위로K개의수뽑기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int k) {

        List<Integer> list = new ArrayList<>();

        for (int a : arr) {
            if (list.size() == k) {
                break;
            }
            if (!list.contains(a)) {
                list.add(a);
            }
        }

        if (k > list.size()) {
            int gap = k - list.size();
            for (int i = 0; i < gap; i++) {
                list.add(-1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
