import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        int result = search(arr, N, M);

        System.out.println(result);


    }

    // 탐색 함수
    static int search(int arr[], int N, int M) {

        int result = 0;
        // 첫 번째 카드 선택
        for(int i = 0; i < N - 2; i++) {
            // 두 번째 카드 선택
            for(int j = i + 1; j < N - 1; j++) {
                // 세 번째 카드 선택
                for(int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if(sum == M) {
                        return sum;
                    }

                    if(result < sum && sum < M) {
                        result = sum;
                    }
                }
            }
        }

        return result;

    }


}








