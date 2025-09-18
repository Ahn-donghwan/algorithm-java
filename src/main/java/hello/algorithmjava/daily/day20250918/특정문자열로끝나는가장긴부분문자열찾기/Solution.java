package hello.algorithmjava.daily.day20250918.특정문자열로끝나는가장긴부분문자열찾기;

class Solution {
    public String solution(String myString, String pat) {
        String target;

        for (int i = myString.length() - 1; i >= 0; i--) {
            target = myString.substring(0, i + 1);
            if (target.endsWith(pat)) {
                return target;
            }
        }
        return null;
    }
}