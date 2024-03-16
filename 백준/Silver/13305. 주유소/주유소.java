import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       long N = scan.nextLong();
       long[] length = new long[(int) (N + 1)];
       long[] cost = new long[(int) (N + 2)];
       long result = 0;


       for(int i = 1; i <= N - 1; i++) {
           length[i] = scan.nextInt();
       }
        for(int i = 1; i <= N; i++) {
            cost[i] = scan.nextInt();
        }

       long costMin = cost[1];



       for(int i = 1; i <= N; i++) {
           if(costMin > cost[i]) {
               costMin = cost[i];
           }
           result += (costMin * length[i]);
       }

        System.out.println(result);


    }
}