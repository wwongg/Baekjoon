import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;





public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());   // 명령의 수

        for(int i=0; i<n; i++) {   // n번 반복
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());   // 명령 번호

            if(order == 1) {   // 명령이 1 이라면,
                int num = Integer.parseInt(st.nextToken());   // 넣어줄 값
                deque.offerFirst(num);   // 맨 앞에 num을 삽입
            } else if(order == 2) {    // 명령이 2 이라면,
                int num = Integer.parseInt(st.nextToken());   // 넣어줄 값
                deque.offerLast(num);   // 맨 뒤에 num을 삽입
            } else if (order == 3) {    // 명령이 3 이라면,
                if(deque.isEmpty()) {   // deque가 비어있다면,
                    bw.write(-1 + "\n");   // -1을 출력
                } else {   // deque가 비어있지 않다면,
                    bw.write(deque.pollFirst() + "\n");   // deque의 맨 앞을 출력 및 삭제
                }
            } else if (order == 4) {    // 명령이 4 이라면,
                if(deque.isEmpty()) {   // deque가 비어있다면,
                    bw.write(-1 + "\n");   // -1을 출력
                } else {   // deque가 비어있지 않다면,
                    bw.write(deque.pollLast() + "\n");   // deque의 맨 뒤를 출력 및 삭제
                }
            } else if (order == 5) {    // 명령이 5 이라면,
                bw.write(deque.size() + "\n");   // deque의 크기를 출력
            } else if (order == 6) {    // 명령이 6 이라면,
                if(deque.isEmpty()) {    // deque가 비어있다면,
                    bw.write(1 + "\n");   // 1을 출력
                } else {    // deque가 비어있지 않다면,
                    bw.write(0 + "\n");   // 0을 출력
                }
            } else if(order == 7) {    // 명령이 7 이라면,
                if(deque.isEmpty()) {   // deque가 비어있다면,
                    bw.write(-1 + "\n");   // -1을 출력
                } else {   //  deque가 비어있지 않다면,
                    bw.write(deque.peekFirst() + "\n");   // deque의 맨 앞을 출력
                }
            } else if (order == 8) {    // 명령이 8 이라면,
                if(deque.isEmpty()) {   // deque가 비어있다면,
                    bw.write(-1 + "\n");   // -1을 출력
                } else {   // deque가 비어있지 않다면,
                    bw.write(deque.peekLast() + "\n");   // deque의 맨 뒤를 출력
                }
            }
        }
        bw.flush();   // 스트림을 비움
        bw.close();   // 스트림 닫음
    }





}