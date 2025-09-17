package hello.algorithmjava.daily.day20250916.빈배열에추가삭제하기;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for (int j = 0; j < 2 * arr[i]; j++) {
                    deque.addLast(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    deque.removeLast();
                }
            }
        }

        return deque.stream().mapToInt(i -> i).toArray();
    }
}