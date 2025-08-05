package hello.algorithmjava.daily.day20250805;

class Solution {

    // 두 수의 연산값 비교하기
    public int solution(int a, int b) {

        int concatValue = Integer.parseInt(String.valueOf(a) + b);
        int productValue = 2 * a * b;

        return Math.max(concatValue, productValue);
    }
}
