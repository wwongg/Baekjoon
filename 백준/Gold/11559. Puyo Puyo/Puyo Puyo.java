

import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Main {

    static char[][] map = new char[12][6];
    static boolean[][] visit = new boolean[12][6];

    static boolean isPop;

    static int popCount;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static class puyo {
        int x, y;
        char color;

        puyo(int x, int y, char color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 12; i++) {
            String input = br.readLine();
            for (int j = 0; j < 6; j++) {
                map[i][j] = input.charAt(j);
            }
        }


        while (true) {
            isPop = false;

            BFS();
            down();

            if(isPop == false) {
                break;
            }

            popCount++;
        }

        System.out.println(popCount);



    }

    static void BFS() {
        Queue<puyo> q = new LinkedList<>();
        visit = new boolean[12][6];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                if(map[i][j] != '.' && !visit[i][j]) {
                    ArrayList<int[]> list = new ArrayList<>();

                    q.add(new puyo(j, i, map[i][j]));
                    visit[i][j] = true;
                    list.add(new int[]{i, j});

                    while (!q.isEmpty()) {
                        puyo p = q.poll();
                        int px = p.x;
                        int py = p.y;
                        char color = p.color;

                        for (int k = 0; k < 4; k++) {
                            int nx = px + dx[k];
                            int ny = py + dy[k];

                            if(nx < 0 || ny < 0 || nx >= 6 || ny >= 12) continue;

                            if (!visit[ny][nx] && map[ny][nx] == color) {
                                q.add(new puyo(nx, ny, color));
                                visit[ny][nx] = true;
                                list.add(new int[]{ny, nx});
                            }
                        }
                    }

                    if(list.size() >= 4) {
                        for (int k = 0; k < list.size(); k++) {
                            int x = list.get(k)[1];
                            int y = list.get(k)[0];

                            map[y][x] = '.';
                            isPop = true;
                        }
                    }
                }
            }
        }
    }

    static void down() {

        for (int k = 0; k < 6; k++) {


            Queue<puyo> puyo = new LinkedList<>();
            int idx = 11;


                for (int j = 11; j >= 0; j--) {
                    if (map[j][k] != '.') {
                        puyo.add(new puyo(idx, k, map[j][k]));
                        map[j][k] = '.';
                    }
                }


            while (!puyo.isEmpty()) {
                puyo p = puyo.poll();
                char color = p.color;

                map[idx][k] = color;
                idx--;
            }
        }
    }























}
