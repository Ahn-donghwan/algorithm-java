package hello.algorithmjava.daily.day20250920.문자열잘라서정렬하기;

import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {

        String[] slices = myString.split("x");

        return Arrays.stream(slices)
                .filter(s -> !s.isEmpty())  // 빈 배열 제외
                .sorted()                   // 정렬
                .toArray(String[]::new);
    }
}
