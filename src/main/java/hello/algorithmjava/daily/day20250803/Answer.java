package hello.algorithmjava.daily.day20250803;

public class Answer {
    public String solution(String my_string, int k) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }

        return sb.toString();
    }
}
