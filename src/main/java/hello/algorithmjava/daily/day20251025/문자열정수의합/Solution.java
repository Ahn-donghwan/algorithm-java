package hello.algorithmjava.daily.day20251025.문자열정수의합;

class Solution {
    public int solution(String num_str) {
        int answer = 0;

        char[] charArray = num_str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            answer += Integer.parseInt(String.valueOf(charArray[i]));
        }

        return answer;
    }
}
