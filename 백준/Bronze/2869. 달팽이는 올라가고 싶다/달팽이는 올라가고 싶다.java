import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int up =  scan.nextInt(); // 낮에 움직일 수 있는 거리
        int down = scan.nextInt(); // 밤에 미끄러지는 거리
        int length = scan.nextInt(); // 올라가야 할 나무 길이

        int day = (length - down) / (up - down); // 나무 정상에 도달하는 일 수
        if(((length - down) % (up - down)) != 0) {
            day++;
        }

        System.out.println(day);


    }
}
