

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Queue<Pair> que = new LinkedList<>();
        int n = scan.nextInt(); // 행
        int m = scan.nextInt();  // 열
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int[][] dist = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        char[][] maze = new char[n][m];
        String str;
        for (int i = 0; i < n; i++) {
            str = scan.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = str.charAt(j);
                dist[i][j] = -1;
            }
        }

        que.offer(new Pair(0, 0));
        dist[0][0] = 0; // 0이 움직일 수 없는 방향
        visited[0][0] = true;

        while (!que.isEmpty()) {
            Pair p = que.poll();
            for(int i = 0; i <4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < m && ny < n && maze[ny][nx] == '1' && !visited[ny][nx]) {
                    dist[ny][nx] = dist[p.y][p.x] + 1;
                    visited[ny][nx] = true;
                    que.offer(new Pair(nx, ny));
                }

            }
        }

        System.out.println(dist[n-1][m-1] + 1);
    }


        public static class Pair {
            int x, y;
            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }


        }




    }







