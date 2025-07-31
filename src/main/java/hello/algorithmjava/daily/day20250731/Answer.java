package hello.algorithmjava.daily.day20250731;

public class Answer {
    public String solution(String[] arr) {

        StringBuilder sb = new StringBuilder();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
