import java.util.*;

class Solution {

    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        // 오름차순 배열 정렬
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        
        while(true) {
            if(wallet[0] < bill[0] || wallet[1] < bill[1]) {
                bill[1] /= 2;
                answer++;
                Arrays.sort(bill);
            } else {
                break;
            }
            
        }
        

        
        return answer;
    }

    
}
