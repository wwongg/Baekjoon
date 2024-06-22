
import java.util.Scanner;
import java.util.Stack;

public class Main {



        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);

                Stack<Integer> stack = new Stack<Integer>();

                int n = scan.nextInt();
                int[] arr = new int[n];

                for(int i = 0; i < n; i++) {
                        arr[i] = scan.nextInt();
                }

                int index = 1;

                for(int i = 0; i < n; i++) {
                        if(arr[i] == index) {
                                index++;
                                while(!stack.empty()) {
                                        if(stack.peek() == index) {
                                                index++;
                                                stack.pop();
                                        } else{
                                                break;
                                        }
                                }
                        } else {
                                stack.push(arr[i]);
                        }
                }

                if(stack.empty()) {
                        System.out.println("Nice");
                } else {
                        System.out.println("Sad");
                }



        }




}