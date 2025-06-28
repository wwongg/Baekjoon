import com.sun.jdi.IntegerType;

import java.io.*;
import java.util.*;

public class Main {

    static char[][] map;
    static int count;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean[][] visit;
    static Queue<int[]> waterQ = new LinkedList<>();
    static int R;
    static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        visit = new boolean[R][C];

        int startX = 0;
        int startY = 0;

        // 비버의 굴은 D, 고슴도치의 위치는 S
        for (int i = 0; i < R; i++) {
            String input = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = input.charAt(j);
                if(map[i][j] == 'S') {
                    startY = i;
                    startX = j;
                    visit[i][j] = true;
                } else if(map[i][j] == '*') {
                    waterQ.add(new int[]{j, i});
                }
            }
        }

        int result = BFS(startX, startY);
        System.out.println(result == -1 ? "KAKTUS" : result);


    }



    static int BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y, 0});

        while (!q.isEmpty()) {


            int waterSize = waterQ.size();
            for (int i = 0; i < waterSize; i++) {
                int[] waterPos = waterQ.poll();
                int waterPx = waterPos[0];
                int waterPy = waterPos[1];

                for (int j = 0; j < 4; j++) {
                    int waterNx = waterPx + dx[j];
                    int waterNy = waterPy + dy[j];

                    if(waterNx < 0 || waterNy < 0 || waterNx >= C || waterNy >= R) continue;
                    if(map[waterNy][waterNx] == '.') {
                        map[waterNy][waterNx] = '*';
                        waterQ.add(new int[]{waterNx, waterNy});
                    }
                }
            }

            int len = q.size();
            for (int j = 0; j < len; j++) {
                int[] pos = q.poll();
                int px = pos[0];
                int py = pos[1];
                count = pos[2];

            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if(nx < 0 || nx >= C || ny < 0 || ny >= R || map[ny][nx] == '*' ||
                map[ny][nx] == 'X') continue;
                if(visit[ny][nx]) continue;
                if(map[ny][nx] == 'D') {
                    return count + 1;
                }


                visit[ny][nx] = true;
                q.add(new int[]{nx, ny, count + 1});

            }

            }


        }
        return -1;


    }










}