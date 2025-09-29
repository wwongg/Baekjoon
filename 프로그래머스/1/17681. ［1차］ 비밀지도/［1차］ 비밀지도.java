import java.io.*;
import java.util.*;


class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        String indexA = "";
        String indexB = "";
        
        int[][] arrA = new int[n][n];
        int[][] arrB = new int[n][n];
        
        for(int i = 0; i < arr1.length; i++) {
            indexA = getBinary(arr1[i], n);
            indexB = getBinary(arr2[i], n);
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < arr1.length; j++) {
               int a = indexA.charAt(j) - '0';
                int b = indexB.charAt(j) - '0';
                
                if (a + b > 0) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            
            answer[i] = sb.toString();
            
            
        }
        return answer;
    }
    
    static String getBinary(int num, int n) {
        String binary = Integer.toBinaryString(num);
        
        return String.format("%" + n + "s", binary).replace(' ', '0');
        
        
        
        
        
    }
}