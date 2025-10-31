package hello.algorithmjava.daily.day20251031.두수의합;

import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        return String.valueOf(new BigInteger(a).add(new BigInteger(b)));
    }
}
