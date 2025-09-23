package hello.algorithmjava.daily.day20250919.x사이의개수;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String myString) {

        List<Integer> list = new ArrayList<>();

        String[] strings = myString.split("x", -1);
        for (String string : strings) {
            list.add(string.length());
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}