import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> box = new ArrayList<>();
        
        for (int index : moves) {
            int realIndex = index - 1;
            
            for (int i = 0; i < board.length; i++) {
                if (board[i][realIndex] != 0) {
                    int doll = board[i][realIndex];
                    board[i][realIndex] = 0; // 뽑았으니 0으로 바꿔줌
                    
                    // 바구니 마지막 인형과 비교
                    if (!box.isEmpty() && box.get(box.size() - 1) == doll) {
                        box.remove(box.size() - 1); // 마지막 인형 제거
                        answer += 2; // 두 개 터짐
                    } else {
                        box.add(doll); // 터지지 않으면 넣음
                    }
                    
                    break; // 인형 하나만 뽑고 종료
                }
            }
        }
        
        return answer;
    }
}
