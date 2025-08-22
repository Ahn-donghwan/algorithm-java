package hello.algorithmjava.daily.day20250822.배열자르기;

import java.util.Arrays;

class Solution {
    // 배열 자르기 - Arrays.copyOfRange() 사용
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
