package hello.algorithmjava.daily.day20250908;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string, int[] index_list) {

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            list.add(String.valueOf(my_string.charAt(i)));
        }

        for (int i = 0; i < index_list.length; i++) {
            sb.append(list.get(index_list[i]));
        }

        return sb.toString();
    }
}
