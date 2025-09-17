package hello.algorithmjava.daily.day20250917.조건에맞게수열변환하기2;

import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {

        int x = 0;

        while (true) {
            int[] preArr = Arrays.copyOf(arr, arr.length);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] /= 2;
                } else if (arr[i] % 2 != 0 && arr[i] < 50) {
                    arr[i] = 2 * arr[i] + 1;
                }
            }

            // 종료 조건
            if (Arrays.equals(arr, preArr)) {
                return x;
            }

            x++;
        }
    }
}
