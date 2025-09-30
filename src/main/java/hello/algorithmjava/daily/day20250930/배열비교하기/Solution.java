package hello.algorithmjava.daily.day20250930.배열비교하기;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            int sum1 = 0;
            for (int num : arr1) {
                sum1 += num;
            }
            int sum2 = 0;
            for (int num : arr2) {
                sum2 += num;
            }

            return Integer.compare(sum1, sum2);
        }
    }
}
