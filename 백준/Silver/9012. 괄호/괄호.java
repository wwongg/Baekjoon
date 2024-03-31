
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt(); // T개의 테스트 데이터

        int j = 1; // while문 실행 시간

        while (j <= T) {
            String vps = scan.next();
            if (isBalanced(vps)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


            j++;
        }
    }


    public static boolean isBalanced(String vps) {
        InStack s = new InStack(vps.length());
        for(int i = 0; i < vps.length(); i++) {
            char ch = vps.charAt(i);
            if(ch == '(') {
                s.push(ch);
            } else if(ch == ')' ){
                if(s.size() <= 0) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }

        return s.size() == 0;
    }



    public static class InStack {
        private char[] stk; // 스택
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
                stk = new char[maxlen];
            } catch (Over e) {
                capacity = 0;
            }
        }

        public char push(char x) throws Over {
            if(ptr >= capacity) {
                throw new Over();
            }
            return stk[ptr++] = x;
        }

        public char pop() throws Empty {
            if(ptr <= 0) {
                throw new Empty();
            }
            return stk[--ptr];
        }

        public char peek() throws Empty {
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







