package hello.algorithmjava.daily.day20250915.글자지우기;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();

        Set<Integer> removeSet = new HashSet<>();

        for (Integer i : indices) {
            removeSet.add(i);
        }

        for (int i = 0; i < my_string.length(); i++) {
            if (!removeSet.contains(i)) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}
