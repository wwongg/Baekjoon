
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[][] room = new int[N][2];

        for(int i = 0; i < N; i++) {
            room[i][0] = scan.nextInt();
            room[i][1] = scan.nextInt();
        }


        Arrays.sort(room, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] ==o2[1]){
                        return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });



        int count = 0;
        int prevRoom = 0;

        for(int i = 0; i < N; i++) {
            if(prevRoom <= room[i][0]) {
                prevRoom = room[i][1];
                count++;
            }
        }

        System.out.println(count);

    }


}







