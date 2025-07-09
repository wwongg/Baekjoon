class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int[] endTimes = new int[schedules.length];
        for(int i = 0; i < schedules.length; i++) {
            int hour = schedules[i] / 100;
            int minute = schedules[i] % 100;
            int newTime = hour * 100 + minute + 10;
            if(newTime % 100 >= 60) newTime += 40;
            endTimes[i] = newTime;
        }
        // 6 - startday, 7 - startday 는 continue로 조건문 제거
        for(int i = 0; i < timelogs.length; i++) {
            int count = 0;
            for(int j = 0; j < 7; j++) {
                int curDay = (j + startday - 1) % 7;
                if(curDay == 5 || curDay == 6) continue;
                
                if(timelogs[i][j] <= endTimes[i]) {
                    count++;
                }
            }
            if(count == 5) answer++;
        }
        
        return answer;
    }
}