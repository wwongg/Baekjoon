import java.io.*;
import java.util.*;

public class Main {

    static int[][] paintCost;

    final static int RED = 0;
    final static int GREEN = 1;
    final static int BLUE = 2;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paintCost = new int[n][3];


        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            paintCost[i][RED] = Integer.parseInt(st.nextToken());
            paintCost[i][GREEN] = Integer.parseInt(st.nextToken());
            paintCost[i][BLUE] = Integer.parseInt(st.nextToken());

        }

        for (int i = 1; i < n; i++) {
            paintCost[i][RED] += Math.min(paintCost[i - 1][GREEN], paintCost[i - 1][BLUE]);
            paintCost[i][GREEN] += Math.min(paintCost[i - 1][RED], paintCost[i - 1][BLUE]);
            paintCost[i][BLUE] += Math.min(paintCost[i - 1][GREEN], paintCost[i - 1][RED]);
        }

        System.out.println(Math.min(Math.min(paintCost[n - 1][RED], paintCost[n - 1][GREEN]), paintCost[n - 1][BLUE]));




    }


}