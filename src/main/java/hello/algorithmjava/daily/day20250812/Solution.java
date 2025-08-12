package hello.algorithmjava.daily.day20250812;

class Solution {

    // 아이스 아메리카노
    public int[] solution(int money) {

        int americano = 5500;

        return new int[] {money / americano, money % americano};
    }
}
