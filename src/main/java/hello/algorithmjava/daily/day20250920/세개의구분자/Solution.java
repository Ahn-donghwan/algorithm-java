package hello.algorithmjava.daily.day20250920.세개의구분자;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {

        String[] split = myStr.split("[abc]");

        List<String> list = new ArrayList<>();
        for (String s : split) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }

        return list.isEmpty() ? new String[]{"EMPTY"} : list.stream().toArray(String[]::new);
    }
}