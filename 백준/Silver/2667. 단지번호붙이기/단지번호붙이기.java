
import java.io.*;
import java.util.*;
import java.util.LinkedList;



public class Main {

    static boolean[][] visit;
    static int[][] map;
    static int n;
    static int apartcount = 1;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static List<Integer> list;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        visit = new boolean[n][n];
        map = new int[n][n];
        list = new LinkedList<>();


        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visit[i][j]) {
                    dfs(i, j);

                    list.add(apartcount);

                    apartcount = 1;

                }
            }
        }
        Collections.sort(list);

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }





    }

    public static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n
                    && !visit[nx][ny] && map[nx][ny] == 1) {
                apartcount++;
                dfs(nx, ny);
            }
        }

    }


















   




}
