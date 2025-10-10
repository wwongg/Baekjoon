import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 가장 작은 수 찾기
        int min = Arrays.stream(arr).min().getAsInt();

        // 가장 작은 수 제외하고 새 리스트 만들기
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != min) {
                list.add(num);
            }
        }

        // 리스트를 int[]로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
