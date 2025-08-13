import java.io.*;
import java.util.*;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
            
            int exchange = n / a;
            int rest = n % a;
            
            answer += (b * exchange);
            n = b * exchange + rest;
            
        }
        
        return answer;
    }
}