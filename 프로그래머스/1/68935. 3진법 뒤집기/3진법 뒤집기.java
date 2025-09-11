import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n) {
            
        int answer = 0;
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(n > 0) {
            numbers.add(n % 3);
            n = n / 3;
        }
        
        Collections.reverse(numbers);
        
        for(int i = 0; i < numbers.size(); i++) {
            answer += numbers.get(i) * Math.pow(3, i);
        }
        
        
        
        return answer;
    }
}