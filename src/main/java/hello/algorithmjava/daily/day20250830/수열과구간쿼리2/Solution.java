package hello.algorithmjava.daily.day20250830.수열과구간쿼리2;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int idx = 0; idx < queries.length; idx++) {
            int s = queries[idx][0];
            int e = queries[idx][1];
            int k = queries[idx][2];

            int minValue = Integer.MAX_VALUE;
            boolean found = false; // flag

            for (int i = s; i <= e; i++) {
                if (k < arr[i]) {
                    answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
                }
            }
        }
        return answer;
    }
}