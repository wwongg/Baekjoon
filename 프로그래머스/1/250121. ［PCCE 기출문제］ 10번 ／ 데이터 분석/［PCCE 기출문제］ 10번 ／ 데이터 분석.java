import java.io.*;
import java.util.*;

class Solution {
    static String[] extx = {"code", "date", "maximum", "remain"};
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        
        
        int extIndex = 0;
        int sortIndex = 0;
        
        for(int i = 0; i < 4; i++) {
            if(extx[i].equals(ext)) {
                extIndex = i;
                
            }
            
            if(extx[i].equals(sort_by)) {
                sortIndex = i;
            }
        }
        
        final int sIndex = sortIndex;
        
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int[] d : data) {
            if(d[extIndex] < val_ext) list.add(d);
        }
        
        Collections.sort(list, (o1, o2) -> o1[sIndex] - o2[sIndex]);
        
        int[][] answer = new int[list.size()][];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        
        
        
        
        
        
        return answer;
    }
}