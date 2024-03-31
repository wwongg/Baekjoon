
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int K = scan.nextInt();
        int sum = 0;
        InStack s  = new InStack(K);
        for(int i = 0; i < K; i++) {
            int n = scan.nextInt();

            if(n == 0) {
                s.pop();
            } else {
                s.push(n);
            }

        }

        for(int i = 0; i < s.size(); i++) {
            int num = s.stk[i];
            sum += num;
        }

        System.out.println(sum);



    }






    public static class InStack {
        private int[] stk; // 스택
        private int capacity; // 스택 용량
        private int ptr; // 스택 포인터

        public class Empty extends RuntimeException {
            public Empty() {}
        }
        public class Over extends RuntimeException {
            public Over(){}
        }

        //생성자
        public InStack(int maxlen) {
            ptr = 0;
            capacity = maxlen;
            try {
                stk = new int[maxlen];
            } catch (Over e) {
                capacity = 0;
            }
        }

        public int push(int x) throws Over {
            if(ptr >= capacity) {
                throw new Over();
            }
            return stk[ptr++] = x;
        }

        public int pop() throws Empty {
            if(ptr <= 0) {
                throw new Empty();
            }
            return stk[--ptr];
        }

        public int peek() throws Empty {
            if(ptr <= 0) {
                throw new Empty();
            }
            return stk[ptr - 1];
        }

        public void clear() {
            ptr = 0;
        }

        public int size() {
            return ptr;
        }


     }




}







