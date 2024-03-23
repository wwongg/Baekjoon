


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        while(true) {
            int[] nums = {scan.nextInt(), scan.nextInt(), scan.nextInt()};

            Arrays.sort(nums);
            if (nums[0] + nums[1] > nums[2]) {
                if (nums[0] == nums[1] && nums[0] == nums[2]) {
                    System.out.println("Equilateral");
                } else if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else if (nums[0] == 0 && nums[0] == nums[1] && nums[0] == nums[2]) {
                break;
            } else {
                System.out.println("Invalid");
            }
        }




    }




}







