package hello.algorithmjava.daily.day20250910.특정한문자를대문자로바꾸기;

class Solution {
    public String solution(String my_string, String alp) {

        char[] charArray = my_string.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (alp.charAt(0) == charArray[i]) charArray[i] = alp.toUpperCase().charAt(0);
        }

        return new String(charArray);
    }
}
