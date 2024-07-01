import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // 낮은 숫자가 우선 순위인 int형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int N = scan.nextInt();

        for(int i = 0; i < N; i++) {
            int val = scan.nextInt();

            if(val > 0) {
                priorityQueue.offer(val);
            } else if(val == 0) {
                if(priorityQueue.isEmpty()) {
                    System.out.println("0");
                }else {
                    System.out.println(priorityQueue.poll());
                }
            }
        }

    }







}


