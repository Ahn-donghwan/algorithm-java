package hello.algorithmjava.daily.day20250729;

public class Answer {
    public int[] solution(int[] numbers) {

        // 1. answer 배열을 numbers 배열의 크기만큼 초기화
        int[] answer = new int[numbers.length];

        // 2. 각 요소를 2배로 넣기 - for 문
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
