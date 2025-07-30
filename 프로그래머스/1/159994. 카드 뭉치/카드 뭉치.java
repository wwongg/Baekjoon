import java.io.*;
import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int curCards1Index = 0;
        int curCards2Index = 0;
        
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        
        for(int i = 0; i < cards1.length; i++) {
            map1.put(cards1[i], i);
        }
        for(int i = 0; i < cards2.length; i++) {
            map2.put(cards2[i], i);
        }
        
        for(int i = 0; i < goal.length; i++) {
            
                if(curCards1Index < cards1.length && goal[i].equals(cards1[curCards1Index])) {
                    curCards1Index++;
                } 
                else if(curCards2Index < cards2.length && goal[i].equals(cards2[curCards2Index])) {
                    curCards2Index++;
                }
                else {
                    return "No";
                 }
        }
        
        return "Yes";
        
        
    }
}