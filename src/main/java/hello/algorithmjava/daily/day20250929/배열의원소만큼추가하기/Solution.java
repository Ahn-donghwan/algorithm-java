package hello.algorithmjava.daily.day20250929.배열의원소만큼추가하기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int n : arr) {
            for (int i = 0; i < n; i++) {
                list.add(n);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
