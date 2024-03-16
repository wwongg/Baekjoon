import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int N = scan.nextInt();
       int[] length = new int[N + 1];
       int[] cost = new int[N + 2];
       int result = 0;


       for(int i = 1; i <= N - 1; i++) {
           length[i] = scan.nextInt();
       }
        for(int i = 1; i <= N; i++) {
            cost[i] = scan.nextInt();
        }

       int costMin = cost[1];



       for(int i = 1; i <= N; i++) {
           if(costMin > cost[i]) {
               costMin = cost[i];
           }
           result += (costMin * length[i]);
       }

        System.out.println(result);


    }
}