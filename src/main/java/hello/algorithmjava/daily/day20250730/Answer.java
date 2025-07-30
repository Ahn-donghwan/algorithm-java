package hello.algorithmjava.daily.day20250730;

public class Answer {
    public String solution(String str1, String str2) {

        StringBuilder sb = new StringBuilder();

        // str1.length() == str2.length()
        for(int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }

        return sb.toString();
    }
}
