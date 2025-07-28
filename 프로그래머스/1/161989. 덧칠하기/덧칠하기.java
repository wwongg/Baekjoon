import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] paint = new boolean[n + 1];
        for(int i = 0; i < section.length; i++) {
            paint[section[i]] = true;
        }
        
        int startIndex = 1;
        
        for(int i = startIndex; i <= n; i++) {
            if(paint[i]) {
                for(int j = i; j < i + m && j <= n; j++) {
                    paint[j] = false;
                }
                    answer++;
                
                startIndex = i + m;
            }
        }
        
        return answer;
    }
}