package hello.algorithmjava.daily.day20250903.콜라츠수열;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {

        List<Integer> list = new ArrayList<>();
        list.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                list.add(n);
                continue;
            }
            if (n % 2 != 0) {
                n = 3 * n + 1;
                list.add(n);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
