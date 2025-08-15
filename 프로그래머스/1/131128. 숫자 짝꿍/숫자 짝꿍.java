import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        // 각 숫자 개수 세기
        for (char c : X.toCharArray()) countX[c - '0']++;
        for (char c : Y.toCharArray()) countY[c - '0']++;

        StringBuilder sb = new StringBuilder();

        // 큰 숫자부터 공통 개수만큼 추가
        for (int i = 9; i >= 0; i--) {
            int common = Math.min(countX[i], countY[i]);
            for (int j = 0; j < common; j++) {
                sb.append(i);
            }
        }

        if (sb.length() == 0) return "-1"; // 공통 숫자 없음
        if (sb.charAt(0) == '0') return "0"; // 모두 0인 경우

        return sb.toString();
    }
}
