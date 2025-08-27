package hello.algorithmjava.daily.day20250827.원소들의곱과합;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int pow = 1;
        int sum = 0;
        for(int i = 0; i < num_list.length; i++) {
            pow *= num_list[i];
            sum += num_list[i];
        }

        return pow < Math.pow(sum, 2) ? 1 : 0;
    }
}
