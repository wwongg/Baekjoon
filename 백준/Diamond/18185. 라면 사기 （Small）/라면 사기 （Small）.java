import java.io.*;
import java.util.*;

public class Main {

    static int[] count;
    static int n;
    static int cost;

    public static void main(String[] args) throws IOException {

        // 연속되지 않은 하나의 공장에서 하나만 산다면 3원
        // 2개로 연속된 두 개의 공장에서 하나씩 사면 5원
        // 3개로 연속된 세 개의 공장에서 하나씩 사면 7원

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());    // 공장 개수
        count = new int[n + 3];


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            count[i] = Integer.parseInt(st.nextToken());

        }

        greedy();
        System.out.println(cost);





    }

    static void greedy() {
        int i, tmp;

        for (int j = 0; j < n; j++) {
            // 두번째 라면이 세번쨰보다 많은 경우
            // 7원 구매를 최대한 하기 위해 최소한으로 5원 구매를 함
            if(count[j + 1] > count[j + 2]) {
                tmp = Math.min(count[j], count[j + 1] - count[j + 2]);
                cost += 5 * tmp;
                count[j] -= tmp;
                count[j + 1] -= tmp;

                tmp = Math.min(count[j], Math.min(count[j + 1],count[j + 2]));
                cost += 7 * tmp;
                count[j] -= tmp;
                count[j + 1] -= tmp;
                count[j + 2] -= tmp;

            }
            // 세번쨰 라면이 두번째보다 ㅁ낳은 경우
            // 7원 구매를 최대한 한 후 5원 구매를 함
            else {
                tmp = Math.min(count[j], count[j + 1]);
                cost += 7 * (tmp);
                count[j] -= tmp;
                count[j + 1] -= tmp;
                count[j + 2] -= tmp;
                tmp = Math.min(count[j], count[j + 1]);
                cost += 5 * (tmp);
                count[j] -= tmp;
                count[j + 1] -= tmp;

            }

            cost += (3 * count[j]);
        }
    }
    







}