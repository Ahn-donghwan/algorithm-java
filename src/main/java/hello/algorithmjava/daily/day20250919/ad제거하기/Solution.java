package hello.algorithmjava.daily.day20250919.ad제거하기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {

        List<String> list = new ArrayList<>();

        for (String str : strArr) {
            if (!str.contains("ad")) {
                list.add(str);
            }
        }

        return list.stream().toArray(String[]::new);
    }
}
