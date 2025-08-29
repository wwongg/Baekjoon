import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for(Integer i : numbers) {
            set.add(i);
        }
        
        for(int i = 0; i <= 9; i++) {
            if(!set.contains(i)) {
                answer += i;
            }
        }
        return answer;
    }
}