

import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Main {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] map;

    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String input = br.readLine();
            for (int j = 1; j <= M; j++) {
                map[i][j] = input.charAt(j - 1) - '0';
            }
        }

        if(N == 1 && M == 1) {
            System.out.println(1);
        } else {
            System.out.println(BFS());

        }

    }

    static int BFS() {
        int[][][] check = new int[2][N + 1][M + 1];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1, 1, 0});
        check[0][1][1] = 1;

        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];
            int count = pos[2];

            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if(nx < 1 || nx > M || ny < 1 || ny > N) continue;

                if(map[ny][nx] == 0) {
                    if(check[count][ny][nx] == 0) {
                        check[count][ny][nx] = check[count][py][px] + 1;
                        q.offer(new int[]{nx, ny, count});

                        if(ny == N && nx == M) {
                            return check[count][ny][nx];
                        }
                    }
                } else {

                    if(count == 0) {
                        if(check[1][ny][nx] == 0) {
                            q.offer(new int[]{nx, ny, 1});
                            check[1][ny][nx] = check[0][py][px] + 1;
                            if(ny == N && nx == M) {
                                return check[1][ny][nx];
                            }
                        }
                    }
                }
            }
        }

        return -1;

    }



















}
