package hello.algorithmjava.daily.day20251112.그림확대;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();

        // 가로 확장
        for (String line : picture) {
            StringBuilder sb = new StringBuilder();

            for (char c : line.toCharArray()) {
                sb.append(String.valueOf(c).repeat(k));
            }
            String expandedLine = sb.toString();

            // 세로 확장
            for (int i = 0; i < k; i++) {
                list.add(expandedLine);
            }
        }

        return list.toArray(new String[0]);
    }
}
