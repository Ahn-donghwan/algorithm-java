package hello.algorithmjava.daily.day20250909.부분문자열이어붙여문자열만들기;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];

            sb.append(new String(my_strings[i].toCharArray(), s, e - s + 1));
        }

        return sb.toString();
    }
}
