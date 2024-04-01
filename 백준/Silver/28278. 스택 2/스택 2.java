

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

class Main {
    static class Stack {
        private List<Integer> stack;

        public Stack() {
            this.stack = new ArrayList<>();
        }

        public void push(int x) {
            stack.add(x);
        }

        public int pop() {
            if (stack.isEmpty())
                return -1;
            return stack.remove(stack.size() - 1);
        }

        public int size() {
            return stack.size();
        }

        public int empty() {
            return stack.isEmpty() ? 1 : 0;
        }

        public int top() {
            if (stack.isEmpty())
                return -1;
            return stack.get(stack.size() - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack stack = new Stack();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            switch (command.charAt(0)) {
                case '1':
                    stack.push(Integer.parseInt(command.substring(2)));
                    break;
                case '2':
                    bw.write(stack.pop() + "\n");
                    break;
                case '3':
                    bw.write(stack.size() + "\n");
                    break;
                case '4':
                    bw.write(stack.empty() + "\n");
                    break;
                case '5':
                    bw.write(stack.top() + "\n");
                    break;
                default:
                    break;
            }
        }

        br.close();
        bw.close();
    }
}

