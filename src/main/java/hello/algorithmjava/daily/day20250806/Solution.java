package hello.algorithmjava.daily.day20250806;

import java.util.HashMap;
import java.util.Map;

class Solution {

//    // 최빈값 구하기
//    // Map
//    public int solution(int[] array) {
//
//        Map<Integer, Integer> countMap = new HashMap<>();
//
//        // 1. 숫자별로 등장 횟수 세기
//        for (int num : array) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//
//        // 2. 최빈값과 등장 횟수 찾기
//        int maxCount = 0;
//        int mode = -1;
//        boolean isDuplicated = false;
//
//        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//            int num = entry.getKey();
//            int count = entry.getValue();
//
//            if (count > maxCount) {
//                maxCount = count;
//                mode = num;
//                isDuplicated = false;
//            } else if (count == maxCount) {
//                isDuplicated = true;
//            }
//        }
//
//        return isDuplicated ? -1 : mode;
//    }

    public int solution(int[] array) {

        int[] count = new int[1000];
        for (int num : array) {
            count[num]++;
        }

        int max = 0;
        int result = 0;
        boolean isDuplicated = false;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                result = i;
                isDuplicated = false;
            } else if (count[i] == max) {
                isDuplicated = true;
            }
        }

        return isDuplicated ? -1 : result;
    }
}
