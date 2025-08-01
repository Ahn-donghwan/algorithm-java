package hello.algorithmjava.daily.day20250801;

import java.util.Arrays;

public class Answer {
    public int solution(int[] array) {
        Arrays.sort(array);

        return array[array.length / 2];
    }
}
