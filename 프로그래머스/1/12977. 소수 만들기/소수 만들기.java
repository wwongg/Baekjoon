class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length - 2; i++) {
            int numA = nums[i];
            for(int j = i + 1; j < nums.length - 1; j++) {
                int numB = nums[j];
                for(int k = j + 1; k < nums.length; k++) {
                    int numC = nums[k];
                    
                    int sum = numA + numB + numC;
                    if(prime(sum)) {
                        answer ++;
                    }
                    
                }
            }
        }

       
        

        return answer;
    }
    
    static boolean prime(int num) {
        
        for(int i = 2; i <= Math.sqrt(num); i++) {
        
			
			if(num % i == 0) {
				
				return false;
			}
		}
        
        return true;
    }
}