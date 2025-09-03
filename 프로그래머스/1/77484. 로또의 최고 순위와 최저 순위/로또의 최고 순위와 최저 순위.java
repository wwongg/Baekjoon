import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zeroCount = 0;
        int matchingNum = 0;
        HashSet<Integer> lottoSet = new HashSet<>();
        HashSet<Integer> winSet = new HashSet<>();
        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) zeroCount++;
            lottoSet.add(lottos[i]);
            winSet.add(win_nums[i]);
        }
        
        for(int num : lottoSet) {
            if(winSet.contains(num)) {
                matchingNum++;
            }
        }
               
        int highRank = getRank(matchingNum + zeroCount);
        int rowRank = getRank(matchingNum);
               
        answer = new int[]{highRank, rowRank};
        
        
        
        return answer;
    }
    
    public int getRank(int count) {
        switch(count) {
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default : return 6;
        }
    }
}