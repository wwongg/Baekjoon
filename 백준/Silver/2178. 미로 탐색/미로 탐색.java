

import java.io.*;
import java.util.*;
import java.util.LinkedList;



public class Main {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};



    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[][] maze = new int[y][x];

        for (int i = 0; i < y; i++) {
            String input = br.readLine();
            for (int j = 0; j < x; j++) {
                int index = input.charAt(j) - '0';
                maze[i][j] = index;
            }
        }

        boolean[][] visit = new boolean[y][x];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {0, 0});
        visit[0][0] = true;

        while (!q.isEmpty()) {
            int[] pair = q.poll();
            int currentX = pair[1];
            int currentY = pair[0];

            for (int i = 0; i < 4; i++) {
                int nx = currentX + dx[i];
                int ny = currentY + dy[i];

                if (nx < 0 || nx >= x || ny < 0 || ny >= y) {
                    continue;
                } else {
                    if(!visit[ny][nx] && maze[ny][nx] == 1) {
                        visit[ny][nx] = true;
                        maze[ny][nx] = maze[currentY][currentX] + 1;
                        q.add(new int[]{ny, nx});
                    }
                }
            }

        }

        System.out.println(maze[y - 1][x - 1]);
    }












   




}
