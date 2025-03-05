import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] room = new int[n][2];

        int roomCount = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            room[i][0] = Integer.parseInt(input[0]);
            room[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(room, (o1, o2) ->  {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }

            else {
                return o1[1] - o2[1];
            }
        });

        int prevEndTime = 0;

        for (int i = 0; i < n; i++) {

            if(prevEndTime <= room[i][0]) {
                prevEndTime = room[i][1];
                roomCount++;
            }
        }

        System.out.println(roomCount);










    }


}