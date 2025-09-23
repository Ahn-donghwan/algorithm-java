package hello.algorithmjava.daily.day20250920.rny_string;

class Solution {
    public String solution(String rny_string) {
        return rny_string.contains("m") ? rny_string.replace("m","rn") : rny_string;
    }
}
