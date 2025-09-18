package hello.algorithmjava.daily.day20250918.A강조하기;

class Solution {
    public String solution(String myString) {

        char[] myStringArray = myString.toCharArray();

        for (int i = 0; i < myStringArray.length; i++) {
            if (myStringArray[i] == 'A') {
            } else if (myStringArray[i] == 'a') {
                myStringArray[i] = 'A';
            } else {
                myStringArray[i] = String.valueOf(myStringArray[i]).toLowerCase().charAt(0);
            }
        }

        return new String(myStringArray);
    }
}
