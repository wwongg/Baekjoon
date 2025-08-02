import java.io.*;
import java.util.*;

class Solution {
    
    
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        int answerIndex = 0;
        
        int todayTotal = convertDay(today);
        
        
        HashMap<String, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < terms.length; i++) {
            String[] ter = terms[i].split(" ");
            map.put(ter[0], Integer.parseInt(ter[1]));
        }
        
        for(int i = 0; i < privacies.length; i++) {
            String[] str = privacies[i].split(" ");
            int priDays = convertDay(str[0]);
            int deadMonth = map.get(str[1]);            
            int expiredDay = priDays + (deadMonth * 28);
            
            
            if(expiredDay <= todayTotal) {
                answer.add(i + 1);
            }
            
        }
        
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private int convertDay(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        return year * 12 * 28 + month * 28 + day;
    }
}