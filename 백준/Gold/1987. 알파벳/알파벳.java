import com.sun.jdi.IntegerType;

import java.io.*;
import java.util.*;

public class Main {

    static boolean[] visitAlpabet = new boolean[26];
    static boolean[][] visit;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static char[][] board;
    static int max = 0;

    static int h;
    static int w;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        board = new char[h][w];
        visit = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            String input = br.readLine();
            for (int j = 0; j < w; j++) {
                board[i][j] = input.charAt(j);
            }
        }

        int startIndex = board[0][0] - 'A';
        visit[0][0] = true;
        visitAlpabet[startIndex] = true;
        DFS(0, 0, 1);


        System.out.println(max);

    }

    static void DFS(int y, int x, int depth) {
        max = Math.max(max, depth);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= w || ny < 0 || ny >= h) continue;

            int index = board[ny][nx] - 'A';
            if(!visitAlpabet[index]) {
                visit[ny][nx] = true;
                visitAlpabet[index] = true;
                DFS(ny, nx, depth + 1);
                visitAlpabet[index] = false;
            }
        }
    }




}