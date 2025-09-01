package hello.algorithmjava.daily.day20250901.수열과구간쿼리4;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = 0; i < arr.length; i++) {
                if (i >= s && i <= e && i % k == 0) {
                    arr[i] += 1;
                }
            }
        }

        return arr;
    }
}
