
import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Main {

    static int[] puzzle = new int[10];
    static int[] dx=new int[]{-1,0,1,0};
    static int[] dy=new int[]{0,-1,0,1};
    static String answer = "123456780";

    static Map<String, Integer> map = new HashMap<>();



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String init = "";
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 3; j++) {
                init += Integer.parseInt(st.nextToken());
            }
        }
        map.put(init, 0);
        System.out.println(bfs(init));


        
    }

    public static int bfs(String start) {
        Queue<String> q = new LinkedList<>();
        q.offer(start);

        while (!q.isEmpty()) {
            String pos = q.poll();
            int move = map.get(pos);
            int index = pos.indexOf("0");
            int x = index % 3;
            int y = index / 3;

            if (pos.equals(answer)) {
                return move;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx > 2 || ny > 2) continue;

                int nPos = ny * 3 + nx;
                char ch = pos.charAt(nPos);
                String next = pos.replace(ch, 'c');
                next = next.replace('0', ch);
                next = next.replace('c', '0');

                if(!map.containsKey(next)) {
                    q.offer(next);
                    map.put(next, move + 1);
                }
            }
        }

        return -1;
    }








}
