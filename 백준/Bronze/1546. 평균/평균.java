import java.util.Scanner;


public class Main {


        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            float[] score = new float[N];
            float sum = 0;

            float max = 0;
            for(int i = 0; i < score.length; i++) {
                score[i] = scan.nextInt();
                if(max < score[i]) {
                    max = score[i];
                }
            }

            for(int i = 0; i < score.length; i++) {
                score[i] = score[i] / max * 100;
                sum += score[i];
            }

            float avg = sum / N;

            System.out.print(avg);














        }

    }