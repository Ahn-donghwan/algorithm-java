package hello.algorithmjava.daily.day20251021.전국대회선발고사;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;

        List<int[]> candidates = new ArrayList<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                candidates.add(new int[]{rank[i], i});    // (rank, index)
            }
        }

        candidates.sort(Comparator.comparingInt(a -> a[0]));

        int a = candidates.get(0)[1];
        int b = candidates.get(1)[1];
        int c = candidates.get(2)[1];

        return 10000 * a + 100 * b + c;
    }
}