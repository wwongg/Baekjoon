

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {





    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int k = scan.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(q.size() > 1) {
            for(int i = 0; i < k - 1; i++) {
                int val = q.poll();
                q.offer(val);
            }

            sb.append(q.poll()).append(", ");
        }

        sb.append(q.poll()).append('>');

        System.out.println(
                sb
        );

    }







}








