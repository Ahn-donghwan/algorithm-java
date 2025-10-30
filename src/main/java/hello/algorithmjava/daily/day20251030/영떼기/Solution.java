package hello.algorithmjava.daily.day20251030.영떼기;

class Solution {
    public String solution(String n_str) {

        char[] charArray = n_str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '0') {
                return n_str.substring(i);
            }
        }
        return null;
    }
}
