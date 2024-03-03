import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        double grade = 0;
        double totalgrade = 0;
        double sum = 0;

        for(int i = 0; i < 20; i++) {
            String study = scan.next();
            double num = scan.nextDouble();
            String score = scan.next();
            if (!score.equals("P")) {
                switch (score) {
                    case "A+":
                        grade = 4.5;
                        break;
                    case "A0":
                        grade = 4.0;
                        break;
                    case "B+":
                        grade = 3.5;
                        break;
                    case "B0":
                        grade = 3.0;
                        break;
                    case "C+":
                        grade = 2.5;
                        break;
                    case "C0":
                        grade = 2.0;
                        break;
                    case "D+":
                        grade = 1.5;
                        break;
                    case "D0":
                        grade = 1.0;
                        break;
                    case "F":
                        grade = 0.0;
                        break;
                }
                sum += num; // 학점의 총합

                totalgrade += num * grade;

            }
        }
        scan.close();

        System.out.printf("%.6f", totalgrade / sum);

    }

}