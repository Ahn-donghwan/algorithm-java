package hello.algorithmjava.daily.day20250807;

class Solution {

    // 짝수는 싫어요
    public int[] solution(int n) {

        int size = (n + 1) / 2; // 배열의 크기 == 홀수의 개수
        int[] answer = new int[size];
        int index = 0;

        // for (초기식; 조건식; 증강식) { ... }
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}
