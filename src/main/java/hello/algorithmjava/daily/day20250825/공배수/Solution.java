package hello.algorithmjava.daily.day20250825.공배수;

class Solution {
    public int solution(int number, int n, int m) {
        return (number % n == 0) && (number % m == 0) ? 1 : 0;
    }
}
