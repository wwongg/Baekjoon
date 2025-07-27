import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] wallpaper) {
       
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[0].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    luy = Math.min(luy, i); 
                    lux = Math.min(lux, j);
                    rdy = Math.max(rdy, i + 1);
                    rdx = Math.max(rdx, j + 1);
                }
            }
        }
        
        int[] answer = {luy, lux, rdy, rdx};
        return answer;
    }
}