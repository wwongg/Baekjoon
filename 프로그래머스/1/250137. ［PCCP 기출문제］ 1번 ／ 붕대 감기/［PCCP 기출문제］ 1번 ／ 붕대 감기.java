class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int endTime = attacks[attacks.length - 1][0];
        int curAttTime = 0;
        int bandageCount = 1;
        int maxHealth = health;
        
        
        for(int i = 1; i <= endTime; i++) {
            
            if(i == attacks[curAttTime][0]) {
                health -= attacks[curAttTime][1];
                curAttTime++;          
                bandageCount = 1;
            } else {
                if(bandageCount == bandage[0]) {
                    health += bandage[2] + bandage[1];
                    bandageCount = 1;
                    if(health >= maxHealth) {
                        health = maxHealth;
                    }
                } else {
                    health += bandage[1];
                    bandageCount++;  
                    if(health >= maxHealth) {
                        health = maxHealth;
                    }
                }
            }
            if(health <=0) {
                return -1;
            }
           
        }
        
        answer = health;
        return answer;
    }
}