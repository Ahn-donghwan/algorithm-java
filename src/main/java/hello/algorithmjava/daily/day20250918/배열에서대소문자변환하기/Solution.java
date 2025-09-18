package hello.algorithmjava.daily.day20250918.배열에서대소문자변환하기;

class Solution {
    public String[] solution(String[] strArr) {

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 != 0) {
                strArr[i] = strArr[i].toUpperCase();
            } else {
                strArr[i] = strArr[i].toLowerCase();
            }
        }

        return strArr;
    }
}