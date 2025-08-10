package hello.algorithmjava.daily.day20250810;

class Solution {
    public int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}
