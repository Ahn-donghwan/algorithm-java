package hello.algorithmjava.daily.day20250826.코드처리하기;

class Solution {
    public String solution(String code) {
        char[] codeArray = code.toCharArray();
        int mode = 0;
        StringBuilder ret = new StringBuilder();

        for(int idx = 0; idx < code.length(); idx++) {
            if(mode == 0) {
                if(codeArray[idx] == '1') {
                    mode = 1;
                } else {
                    if((idx % 2) == 0) {
                        ret.append(codeArray[idx]);
                    }
                }
            } else if(mode == 1) {
                if(codeArray[idx] == '1') {
                    mode = 0;
                } else {
                    if((idx % 2) == 1) {
                        ret.append(codeArray[idx]);
                    }
                }
            }
        }

        return ret.toString().isEmpty() ? "EMPTY" : ret.toString();
    }
}
