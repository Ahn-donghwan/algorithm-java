package hello.algorithmjava.daily.day20250813;

class Solution {

    // 뒤집힌 문자열
    public String solution(String my_string) {

//        StringBuilder sb = new StringBuilder();
//
//        for(int i = 0; i < my_string.length(); i++) {
//            sb.append(my_string.charAt(my_string.length() - (i + 1)));
//        }
//
//        return sb.toString();
        return new StringBuilder(my_string).reverse().toString();
    }
}
