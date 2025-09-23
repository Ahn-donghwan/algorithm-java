package hello.algorithmjava.daily.day20250920.간단한식계산하기;

class Solution {
    public int solution(String binomial) {

        String[] param = binomial.split(" ");
        int p1 = Integer.parseInt(param[0]);
        int p2 = Integer.parseInt(param[2]);

        switch (param[1]) {
            case "+": return p1 + p2;
            case "-": return p1 - p2;
            case "*": return p1 * p2;
            default: throw new IllegalArgumentException();
        }
    }
}
