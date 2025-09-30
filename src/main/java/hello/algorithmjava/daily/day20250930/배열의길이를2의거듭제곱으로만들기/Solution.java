package hello.algorithmjava.daily.day20250930.배열의길이를2의거듭제곱으로만들기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();

        // arr 의 길이보다 큰 2 의 정수 거듭제곱 찾기
        int exp = 0;
        while (Math.pow(2, exp) < arr.length) {
            exp++;
        }

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        while (list.size() < Math.pow(2, exp)) {
            list.add(0);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
