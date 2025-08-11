package hello.algorithmjava.daily.day20250811;

class Solution {
    public int solution(int price) {

        // 옷가게 할인 받기
        if(price >= 500000) {
            return (int) (price * 0.8);
        } else if(price >= 300000) {
            return (int) (price * 0.9);
        } else if(price >= 100000) {
            return (int) (price * 0.95);
        }
        return price;
    }
}
