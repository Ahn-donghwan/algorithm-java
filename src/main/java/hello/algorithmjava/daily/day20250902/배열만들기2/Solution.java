package hello.algorithmjava.daily.day20250902.배열만들기2;

import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        Deque<Long> q = new ArrayDeque<>(); // Deque : 덱
        q.add(5L); // 시작은 5

        while (!q.isEmpty()) {
            long cur = q.poll();    // cur : 현재 값

            if (cur > r) continue;  // r 초과면 버리고 자식도 볼 필요 없음
            if (cur >= 1) list.add((int) cur); // 구간 안이면 수집

            long a = cur * 10;      // 뒤에 0 붙이기
            long b = cur * 10 + 5;  // 뒤에 5 붙이기

            if (a <= r) q.add(a);
            if (b <= r) q.add(b);
        }

        if (list.isEmpty()) return new int[]{-1};
//        BFS 라 이미 오름차순이지만, 안전하게 정렬하고 싶으면 아래 주석 해제
//        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
