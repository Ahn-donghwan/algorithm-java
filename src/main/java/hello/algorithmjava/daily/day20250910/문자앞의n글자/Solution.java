package hello.algorithmjava.daily.day20250910.문자앞의n글자;

class Solution {
    public String solution(String my_string, int n) {

        StringBuilder sb = new StringBuilder();
        char[] string = my_string.toCharArray();

        for (int i = 0; i < n; i++) {
            sb.append(string[i]);
        }

        return sb.toString();
    }
}
