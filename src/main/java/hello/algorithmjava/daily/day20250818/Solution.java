package hello.algorithmjava.daily.day20250818;

class Solution {

    // 짝수 홀수 개수
    public int[] solution(int[] num_list) {
        int a = 0;
        int b = 0;

        for (int i : num_list) {
            if (i % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }
        return new int[]{a, b};
    }
}
