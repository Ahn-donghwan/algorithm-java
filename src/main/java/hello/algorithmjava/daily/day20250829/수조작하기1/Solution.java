package hello.algorithmjava.daily.day20250829.수조작하기1;

class Solution {
    public int solution(int n, String control) {

        char[] charArray = control.toCharArray();

        for(int i = 0; i < charArray.length; i++) {
            switch(charArray[i]) {
                case 'w': n += 1; break;
                case 's': n -= 1; break;
                case 'd': n += 10; break;
                case 'a': n -= 10; break;
            }
        }

        return n;
    }
}
