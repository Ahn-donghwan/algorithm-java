package hello.algorithmjava.daily.day20250829.수열과구간쿼리3;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            int tmp = arr[i]; // 서로 스왑할 임시 공간 마련
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        return arr;
    }
}
