package hello.algorithmjava.daily.day20251001.문자열묶기;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {

//        // 배열
//        int[] lengthArr = new int[strArr.length];
//        int[] count = new int[31];
//
//        for (int i = 0; i < strArr.length; i++) {
//            lengthArr[i] = strArr[i].length();
//        }
//
//        for (int l : lengthArr) {
//            count[l] += 1;
//        }
//
//        int max = 0;
//        for (int i = 0; i < strArr.length; i++) {
//            if (count[i] > max) {
//                max = count[i];
//            }
//        }
//
//        return max;

        Map<Integer, Integer> map = new HashMap<>();

        for (String str : strArr) {
            map.put(str.length(), map.getOrDefault(str.length(), 0) + 1);
        }

        return Collections.max(map.values());
    }
}
