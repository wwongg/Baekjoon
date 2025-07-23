import java.io.*;
import java.util.*;

class Solution {
    
    static int[] dh = {0, 1, -1, 0};
    static int[] dw = {1, 0, 0, -1};
    
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        String color = board[h][w];
        boolean[][] visited = new boolean[n][n];
        visited[h][w] = true;
        
        
            
            
            for(int i = 0; i < 4; i++) {
                int nh = h + dh[i];
                int nw = w + dw[i];
                
                if(nh < 0 || nw < 0 || nh >= n || nw >= n) continue;
                
                if(!visited[nh][nw] && color.equals(board[nh][nw])) {
                    answer++;
                    
                    visited[nh][nw] = true;
                }
            }
        
        return answer;
    }
}