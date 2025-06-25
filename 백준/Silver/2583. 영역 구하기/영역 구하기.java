import com.sun.jdi.IntegerType;

import java.io.*;
import java.util.*;

public class Main {


    static int[][] map;
    static int N;
    static int M;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int count;

    static boolean[][] visit;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrayList = new ArrayList<>();

        map = new int[M][N];
        visit = new boolean[M][N];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());
            colorMap(sx, sy, ex, ey);
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j] != 1 && !visit[i][j]) {
                    BFS(i, j);
                    arrayList.add(count);
                }
            }

        }

        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }



    }

    // y축만 x축 대칭으로 이동해서 생각하기
    static void colorMap(int sx, int sy, int ex, int ey) {
        int startY = M - ey;
        int endY = M - sy;

        for (int i = startY; i < endY; i++) {
            for (int j = sx; j < ex; j++) {
                map[i][j] = 1;
            }
        }
    }

    static void BFS(int startY, int startX) {
        Queue<int[]> q = new LinkedList<>();

       count = 1;
        q.add(new int[]{startX, startY});
        visit[startY][startX] = true;


        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];


            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                if(!visit[ny][nx] && map[ny][nx] == 0) {
                    visit[ny][nx] = true;

                    q.add(new int[] {nx, ny});
                    count++;
                }


            }

        }


    }









}