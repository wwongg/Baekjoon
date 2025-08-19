import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        // 모든 성격 유형 초기화
        HashMap<Character, Integer> score = new HashMap<>();
        char[] types = {'R','T','C','F','J','M','A','N'};
        for (char c : types) {
            score.put(c, 0);
        }
        
        // 점수 계산
        for (int i = 0; i < survey.length; i++) {
            char disagree = survey[i].charAt(0); // 비동의 쪽
            char agree = survey[i].charAt(1);    // 동의 쪽
            
            if (choices[i] > 4) { // 동의 쪽 점수
                score.put(agree, score.get(agree) + (choices[i] - 4));
            } else if (choices[i] < 4) { // 비동의 쪽 점수
                score.put(disagree, score.get(disagree) + (4 - choices[i]));
            }
            // choices[i] == 4일 때는 아무 점수도 안 줌
        }
        
        // 최종 유형 계산
        answer += (score.get('R') >= score.get('T')) ? "R" : "T";
        answer += (score.get('C') >= score.get('F')) ? "C" : "F";
        answer += (score.get('J') >= score.get('M')) ? "J" : "M";
        answer += (score.get('A') >= score.get('N')) ? "A" : "N";
        
        return answer;
    }
}
