import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Ballon {
    int index;
    int value;

    public Ballon(int index, int value) {
        this.index = index;
        this.value = value;
    }
}

public class Main {



        public static void main(String[] args) throws IOException {
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Deque<Ballon> dq = new ArrayDeque<>();
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for(int i = 1; i <= n; i++) {
                dq.offer(new Ballon(i, Integer.parseInt(st.nextToken())));
            }

            while(dq.size() > 1) {
                Ballon b = dq.poll();
                sb.append(b.index).append(" ");
                int x = b.value;

                if(x > 0) {
                    for(int i = 1; i < x; i++) {
                        dq.offer(dq.poll());
                    }
                } else {
                    for(int i = 0; i < Math.abs(x); i++) {
                        dq.offerFirst(dq.pollLast());
                    }
                }
            }

            Ballon m = dq.poll();
            sb.append(m.index);
            System.out.println(sb);

        }












}
