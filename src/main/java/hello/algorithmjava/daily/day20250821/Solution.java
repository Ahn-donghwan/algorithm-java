package hello.algorithmjava.daily.day20250821;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;

        // 양꼬치(12000원): n 인분, 음료수(2000원): k 개

        int total = 12000 * n + 2000 * k;
        int discount = (n / 10) * 2000;

        answer = total - discount;

        return answer;
    }
}
