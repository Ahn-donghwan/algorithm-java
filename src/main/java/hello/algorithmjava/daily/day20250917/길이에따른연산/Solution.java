package hello.algorithmjava.daily.day20250917.길이에따른연산;

class Solution {
    public int solution(int[] num_list) {

        int num;

        if (num_list.length >= 11) {
            num = 0;
            for (int i = 0; i < num_list.length; i++) {
               num += num_list[i];
            }
        } else {
            num = 1;
            for (int i = 0; i < num_list.length; i++) {
                num *= num_list[i];
            }
        }

        return num;
    }
}