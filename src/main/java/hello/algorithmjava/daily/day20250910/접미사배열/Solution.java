package hello.algorithmjava.daily.day20250910.접미사배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            list.add(new String(my_string.toCharArray(), i, my_string.length() - i));
        }

        String[] array = list.stream().toArray(String[]::new);
        Arrays.sort(array);

        return array;
    }
}