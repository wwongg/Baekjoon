import java.util.*;
import java.io.*;

class Solution {
    
    static HashMap<String, Integer> mapIndex;
    static HashMap<Integer, String> mapPlayer;
    
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        mapIndex = new HashMap<>();
        mapPlayer = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            mapIndex.put(players[i], i);
            mapPlayer.put(i, players[i]);
        }
        
        for(int i = 0; i < callings.length; i++) {
            String calledPlayer = callings[i];
            int currentRank = mapIndex.get(calledPlayer);
            String player = mapPlayer.get(currentRank);
            
            String frontPlayer = mapPlayer.get(currentRank - 1);
            
            mapIndex.put(player, currentRank - 1);
            mapPlayer.put(currentRank - 1, player);
            
            mapIndex.put(frontPlayer, currentRank);
            mapPlayer.put(currentRank, frontPlayer);
            
        }
        
        for(int i = 0; i < players.length; i++) {
            answer[i] = mapPlayer.get(i);
        }
        return answer;
    }
    
    
}