package hello.algorithmjava.daily.day20250929.배열만들기6;

import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (arr[i] == stack.peek()) {
                stack.pop();
            } else if (arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }

        return stack.isEmpty() ? new int[]{-1} : stack.stream().mapToInt(i -> i).toArray();
    }
}