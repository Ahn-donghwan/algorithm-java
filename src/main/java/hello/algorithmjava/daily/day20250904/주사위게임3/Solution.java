package hello.algorithmjava.daily.day20250904.주사위게임3;

import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {

        Map<Integer, Integer> count = new HashMap<>();
        for (int x : new int[]{a, b, c, d}) {
            count.merge(x, 1, Integer::sum);
        }

        switch (count.size()) {
            case 1: {   // 4개 모두 같은 경우
                return 1111 * count.keySet().iterator().next();
            }
            case 2: {   // 3+1 또는 2+2
                Iterator<Map.Entry<Integer, Integer>> it = count.entrySet().iterator();
                Map.Entry<Integer, Integer> e1 = it.next();
                Map.Entry<Integer, Integer> e2 = it.next();

                int k1 = e1.getKey();
                int k2 = e2.getKey();
                int v1 = e1.getValue();
                int v2 = e2.getValue();

                if (v1 == 3) {
                    return (int) Math.pow((10 * k1) + k2, 2);
                } else if (v2 == 3) {
                    return (int) Math.pow((10 * k2) + k1, 2);
                } else if (v1 == 2 && v2 == 2) {
                    return (k1 + k2) * (Math.abs(k1 - k2));
                }
            }
            case 3: {   // 2+1+1
                int prod = 1;
                for (Map.Entry<Integer, Integer> e : count.entrySet()) {
                    if (e.getValue() == 1) {
                        prod *= e.getKey();
                    }
                }
                return prod;
            }
            case 4: {   // 1+1+1+1
                return Math.min(Math.min(a, b), Math.min(c, d));
            }
            default: {
                throw new IllegalStateException("Unexpected size: " + count.size());
            }
        }
    }
}
