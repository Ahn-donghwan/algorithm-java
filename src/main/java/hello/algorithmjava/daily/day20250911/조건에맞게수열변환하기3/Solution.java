package hello.algorithmjava.daily.day20250911.조건에맞게수열변환하기3;

class Solution {
    public int[] solution(int[] arr, int k) {

        if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] *= k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] += k;
            }
        }

        return arr;
    }
}
