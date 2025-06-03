import java.io.*;
import java.util.*;
import java.util.LinkedList;



public class Main {
    static int[] arr;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
    public static void main(String[] args) throws IOException{

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스 개수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());    // 순열의 개수
            getArr(n);
            sb.append(cycle(arr, n));
            sb.append("\n");
        }

        System.out.println(sb);

    }

    public static void getArr(int n) throws IOException {
        arr = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static int cycle(int[] arr, int n) {
        int count = 0;
        boolean[] visit = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                int go = arr[i];
                while (true) {
                    if (visit[go]) {
                        count++;
                        break;
                    }
                    visit[go] = true;
                    go = arr[go];


                }
            }
        }
        return count;

    }












   




}
