
import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Main {

    static int[][] box;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static Queue<tomato> q = new LinkedList<>();
    static int n;
    static int m;

    static class tomato {
        int x;
        int y;
        int day;

        public tomato(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        box = new int[n][m];


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if(box[i][j] == 1) {
                    q.offer(new tomato(i, j, 0));

                }
            }
        }

        BFS();





        
    }

    static void BFS() {
        int day = 0;

        while (!q.isEmpty()) {
            tomato t = q.poll();
            day = t.day;

            for (int k = 0; k < 4; k++) {
                int nx = t.x + dx[k];
                int ny = t.y + dy[k];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0) {

                    box[nx][ny] = 1;
                    q.offer(new tomato(nx, ny , day + 1));

                }
            }
        }

        if(checkTomato()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }

    }

    static boolean checkTomato() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(box[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }






}
