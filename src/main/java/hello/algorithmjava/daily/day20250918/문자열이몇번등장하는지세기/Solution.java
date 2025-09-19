package hello.algorithmjava.daily.day20250918.문자열이몇번등장하는지세기;

class Solution {
    public int solution(String myString, String pat) {
        int count = 0;

        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            String string = new String(myString.toCharArray(), i, pat.length());
            if (string.equals(pat)) {
                count++;
            }
        }

        return count;
    }
}
