package hello.algorithmjava.daily.day20250827.마지막두원소;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] newList = Arrays.copyOf(num_list, num_list.length + 1);

        if(num_list[num_list.length-1] > num_list[num_list.length-2]){
            newList[newList.length - 1] = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else {
            newList[newList.length-1] = num_list[num_list.length-1] * 2;
        }

        return newList;
    }
}