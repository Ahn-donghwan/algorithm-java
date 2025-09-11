package hello.algorithmjava.daily.day20250911.문자열뒤집기;

class Solution {
    public String solution(String my_string, int s, int e) {

        StringBuilder sb = new StringBuilder();

        String head = my_string.substring(0, s);
        String middle = my_string.substring(s, e + 1);
        String tail = my_string.substring(e + 1);

        return sb.append(head).append(new StringBuilder(middle).reverse()).append(tail).toString();
    }
}
