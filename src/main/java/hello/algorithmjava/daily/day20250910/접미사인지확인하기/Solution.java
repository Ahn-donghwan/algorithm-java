package hello.algorithmjava.daily.day20250910.접미사인지확인하기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String my_string, String is_suffix) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            list.add(new String(my_string.toCharArray(), i, my_string.length() - i));
        }

        return list.contains(is_suffix) ? 1 : 0;
    }
}
