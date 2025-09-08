package hello.algorithmjava.daily.day20250908.문자열여러번뒤집기;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            for (int i = start; i < end; i++) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        return new String(arr);
    }
}
