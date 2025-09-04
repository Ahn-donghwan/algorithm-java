package hello.algorithmjava.daily.day20250904.간단한논리연산;

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return up(down(x1, x2), down(x3, x4));
    }

    public boolean down(boolean x, boolean y) {
        return x ? true : y;
    }
    public boolean up(boolean x, boolean y) {
        return !y ? false : x;
    }
}
