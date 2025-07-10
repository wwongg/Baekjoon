import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        List<Integer> matList = new ArrayList<>();
        // mats 를 리스트화 시킨후 오름차순 정렬
        Arrays.stream(mats).forEach(matList::add);
        Collections.sort(matList);

        int answer = -1;

        // 공원 첫번째 칸부터 순차적으로 확인
        for(int i=0; i<park.length; i++) {
            if(matList.isEmpty()) break;

            for(int j=0; j<park[i].length; j++) {
                if(matList.isEmpty()) break;

                // 배열의 값이 -1 일 경우 실행
                if(park[i][j].equals("-1")) {

                    while(!matList.isEmpty()) {
                        // 오름차순 된 리스트의 첫번째 항목 get
                        Integer mat = matList.get(0);

                        boolean flag = true;
                        // park[i][j]부터 매트의 길이만큼 조회
                        for(int y=i; y<Math.min(i+mat, park.length); y++) {
                            for(int x=j; x<Math.min(j+mat, park[y].length); x++) {
                                // 만약 매트 길이가 공원 밖으로 나간다면 flag = false 처리 후 반복문 종료
                                if(park.length-i < mat || park[i].length-j < mat || !park[y][x].equals("-1")) {
                                    flag = false;
                                    break;
                                }
                            }
                            if(!flag) break;
                        }

                        if(!flag) {
                            break;
                        } else {
                            // 매트의 길이에 만족한다면 answer 값을
                            // 조회한 매트한 길이로 변경
                            // 그 후 다른 칸에서는 해당 매트의 길이로 조회할 필요가 없기 때문에 remove 처리
                            answer = matList.get(0);
                            matList.remove(0);
                        }
                    }

                }
            }
        }

        return answer;
    }
}