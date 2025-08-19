package hello.algorithmjava.daily.day20250819;

class Solution {

    // 문자 반복 출력하기
    public String solution(String my_string, int n) {

        // my_string 하나하나 배열에 담기
        char[] chars = my_string.toCharArray();

        StringBuilder answer = new StringBuilder();

        // 배열 반복 출력 (n회)
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer.append(chars[i]);
            }
        }

        return answer.toString();
    }
}
