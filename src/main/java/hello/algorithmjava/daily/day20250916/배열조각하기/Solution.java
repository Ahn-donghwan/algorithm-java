package hello.algorithmjava.daily.day20250916.배열조각하기;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스 : 앞부분만 씀
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            } else {
                // 홀수 인덱스 : 뒷부분만 씀
                arr = Arrays.copyOfRange(arr, query[i], arr.length + 1);
            }
        }

        return arr;
    }
}