package hello.algorithmjava.daily.day20250903.배열만들기4;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();

        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i += 1;
            } else {
                if(stk.peekLast() < arr[i]) {
                    stk.addLast(arr[i]);
                    i += 1;
                } else {
                    stk.removeLast();
                }
            }
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
