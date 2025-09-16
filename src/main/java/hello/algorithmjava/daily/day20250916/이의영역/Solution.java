package hello.algorithmjava.daily.day20250916.이의영역;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {

        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                deque.addLast(i);
            }
        }

        Integer startIdx = deque.peekFirst();
        Integer endIdx = deque.peekLast();

        if (deque.isEmpty()) {
            list.add(-1);
        } else if (startIdx == endIdx) {
            list.add(2);
        } else {
            for (int i = startIdx; i <= endIdx; i++) {
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
