
import org.w3c.dom.ls.LSException;

import java.io.*;
import java.util.*;
import java.util.LinkedList;



public class Main {

    static int[] count = new int[100001];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());   // 수빈이의 위치
        int k = Integer.parseInt(st.nextToken());   // 동생의 위치

        if(n == k) {
            System.out.println(0);
        } else {
            bfs(n, k);
        }


    }

    static void bfs(int num, int k) {
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        count[num] = 1;

        while (true) {
            int temp = q.poll();

            for (int i = 0; i < 3; i++) {
                int next = 0;

                if(i == 0) {
                    next = temp + 1;
                } else if(i == 1) {
                    next = temp - 1;
                } else if(i == 2) {
                    next = 2*temp;
                }

                if(next == k) {
                    System.out.println(count[temp]);
                    return;
                }

                if(next >= 0 && next < count.length && count[next] == 0) {
                    q.add(next);
                    count[next] = count[temp] + 1;
                }
            }
        }

    }















   




}


