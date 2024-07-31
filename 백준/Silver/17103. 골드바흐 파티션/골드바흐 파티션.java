import java.io.*;

public class Main {

    static boolean[] isPrime = new boolean[1_000_001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        findPrimes();  // 소수 배열 생성

        int T = Integer.parseInt(br.readLine());
        int[] cases = new int[T];

        for (int i = 0; i < T; i++) {
            cases[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < T; i++) {
            int n = cases[i];
            int count = 0;
            for (int j = 2; j <= n / 2; j++) {
                if (isPrime[j] && isPrime[n - j]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void findPrimes() {
        // 소수 배열 초기화
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체로 소수 판별
        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
