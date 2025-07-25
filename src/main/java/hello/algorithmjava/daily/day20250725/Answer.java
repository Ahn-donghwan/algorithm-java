package hello.algorithmjava.daily.day20250725;

public class Answer {

    public String solution(String my_string, String overwrite_string, int s) {

        String start = my_string.substring(0, s);
        String end = my_string.substring(s + overwrite_string.length());

        return start + overwrite_string + end;
    }

    public static void main(String[] args) {

        Answer answer = new Answer();

        // ex 1
        String result1 = answer.solution("He11oWor1d", "lloWorl", 2);
        System.out.println(result1); // HelloWorld

        // ex 2
        String result2 = answer.solution("Program29b8UYP", "merS123", 7);
        System.out.println(result2); // HelloWorld

    }
}
