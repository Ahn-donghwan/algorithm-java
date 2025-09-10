package hello.algorithmjava.daily.day20250909.문자열뒤의n글자;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            answer += my_string.charAt(my_string.length() - i);
        }

        return new StringBuilder(answer).reverse().toString();
    }
}