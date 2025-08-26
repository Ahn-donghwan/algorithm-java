package hello.algorithmjava.daily.day20250826.등차수열의특정한항만더하기;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i = 0; i < included.length; i++) {
            if(included[i]) {
                answer += a + (i * d);
            }
        }

        return answer;
    }
}