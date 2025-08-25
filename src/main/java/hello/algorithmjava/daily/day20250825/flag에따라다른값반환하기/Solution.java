package hello.algorithmjava.daily.day20250825.flag에따라다른값반환하기;

class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag == true ? a + b : a - b;
    }
}
