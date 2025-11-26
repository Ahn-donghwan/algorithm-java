package hello.algorithmjava.daily.day20251114.정수를나선형으로배치하기;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;
        int max = n * n;

        while (num <= max) {
            // 1. 왼 → 오 (윗줄)
            for (int col = left; col <= right && num <= max; col++) {
                answer[top][col] = num++;
            }
            top++;

            // 2. 위 → 아래 (오른쪽 줄)
            for (int row = top; row <= bottom && num <= max; row++) {
                answer[row][right] = num++;
            }
            right--;

            // 3. 오 → 왼 (아랫줄)
            for (int col = right; col >= left && num <= max; col--) {
                answer[bottom][col] = num++;
            }
            bottom--;

            // 4. 아래 → 위 (왼쪽 줄)
            for (int row = bottom; row >= top && num <= max; row--) {
                answer[row][left] = num++;
            }
            left++;
        }

        return answer;
    }
}
