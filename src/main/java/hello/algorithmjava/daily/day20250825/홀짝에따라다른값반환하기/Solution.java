package hello.algorithmjava.daily.day20250825.홀짝에따라다른값반환하기;

class Solution {
    public int solution(int n) {
        int answer = 0;

        if(n % 2 == 1) {
            answer = (int) Math.pow((n + 1) / 2, 2);
        } else {
            for (int i = 1; i <= n / 2; i++) {
                answer += 4 * Math.pow(i, 2);
            }
        }

        return answer;
    }
}
