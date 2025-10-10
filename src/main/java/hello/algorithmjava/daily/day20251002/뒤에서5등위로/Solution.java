package hello.algorithmjava.daily.day20251002.뒤에서5등위로;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {

        List<Integer> list = new ArrayList<>();
        Arrays.sort(num_list);

        for (int i = 0; i < num_list.length; i++) {
            if (i > 4) {
                list.add(num_list[i]);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
