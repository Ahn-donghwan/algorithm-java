package hello.algorithmjava.daily.day20250804;

class Solution {

    // 더 크게 합치기
    public int solution(int a, int b) {

        int ab = Integer.parseInt(String.valueOf(a) + b);
        int ba = Integer.parseInt(String.valueOf(b) + a);

        return Math.max(ab, ba);
    }
}
