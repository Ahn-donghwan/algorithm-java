package hello.algorithmjava.daily.day20250728;

public class Answer {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        // 1. 공통 분모 만들기
        int denom = getLCM(denom1, denom2);

        // 2. 분자 계산하기
        numer1 *= denom / denom1;
        numer2 *= denom / denom2;
        int numer = numer1 + numer2;

        // 3. 기약분수 만들기
        int gcd = getGCD(numer, denom);
        int[] answer = {numer/gcd, denom/gcd};

        return answer;
    }

    // 최소 공배수 (LCM)
    public int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }

    // 최소 공약수 (GCD)
    public int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
}
