package hello.algorithmjava.daily.day20250917.일로만들기;

class Solution {
    public int solution(int[] num_list) {
        int x = 0;

        for (int i = 0; i < num_list.length; i++) {

            while (true) {
                if (num_list[i] == 1) {
                    break;
                } else if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                }
                x++;
            }
        }

        return x;
    }
}
