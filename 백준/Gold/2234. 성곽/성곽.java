import com.sun.jdi.IntegerType;

import java.io.*;
import java.util.*;

public class Main {

    static int[][] map;
    static int[] dy = { 0, -1, 0, 1 };
    static int[] dx = { -1, 0, 1, 0 };

    static int[] dir = {1, 2, 4, 8};

    static int X;
    static int Y;

    static int[][] roomIndex;
    static int roomNumber = 0;
    static int maxExtent = Integer.MIN_VALUE;
    static HashMap<Integer, Set<Integer>> side = new HashMap<>();
    static ArrayList<Integer> spaces = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        map = new int[Y][X];

        roomIndex = new int[Y][X];

        for (int i = 0; i < Y; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < X; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 서쪽에 벽 +1, 북쪽에 벽 +2, 동쪽에 벽 +4, 남쪽에 벽 +8;
        int num = 1;
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                if (roomIndex[i][j] == 0) {
                    BFS(i, j, num++);

                }
            }
        }
        roomNumber = num - 1;
        System.out.println(roomNumber);
        System.out.println(maxExtent);
        int sum = 0;
        for (int i = 1; i <= roomNumber; i++) {
            if(side.get(i) != null) {
                for (int room : side.get(i)) {
                    // spaces의 인덱스는 0부터 시작하므로 i-1, j-1이라고 표현함.
                    sum = Math.max(spaces.get(i - 1) + spaces.get(room - 1), sum);
                }
            }
        }
        System.out.println(sum);
    }

    static void BFS(int y, int x, int index) {
        Queue<int[]> q = new LinkedList<>();

        roomIndex[y][x] = index;

        Set<Integer> set = new HashSet<>();
        int cnt = 0;

        q.add(new int[]{x, y});
        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];
            cnt++;

            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                if(nx < 0 || nx >= X || ny < 0 || ny >= Y) continue;

                if(roomIndex[ny][nx] != 0 && roomIndex[ny][nx] != index) {
                    set.add(roomIndex[ny][nx]);

                }

                if((map[py][px] & dir[i]) == 0 && roomIndex[ny][nx] == 0) {
                    q.add(new int[]{nx, ny});
                    roomIndex[ny][nx] = index;

                }
            }
        }
        side.put(index, set);
        spaces.add(cnt);
        maxExtent = Math.max(maxExtent, cnt);
    }






}