package hello.algorithmjava.daily.day20250909.배열만들기5;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {

        List<Integer> list = new ArrayList<>();

        for (String intStr : intStrs) {
            int i = Integer.parseInt(new String(intStr.toCharArray(), s, l));
            if (i > k) list.add(i);
        }

//        return list.stream().mapToInt(Integer::intValue).toArray();
        return list.stream().mapToInt(i -> i).toArray();
    }
}
