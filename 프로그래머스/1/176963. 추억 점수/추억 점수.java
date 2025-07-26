import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            String nameOfI = name[i];
            int yearScore = yearning[i];
            map.put(nameOfI, yearScore);
        }
        
        for(int i = 0; i < photo.length; i++) {
            int score = 0;
            for(int j = 0; j < photo[i].length; j++) {
                if(map.containsKey(photo[i][j])) {
                    score += map.get(photo[i][j]);
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}