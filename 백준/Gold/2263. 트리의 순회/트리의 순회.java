
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    // postOrder => 가장 마지막 숫자가 루트에 해당
    // inOrder => 루트를 기준으로 왼쪽은 왼쪽 서브트리, 오른쪽은 오른쪽 서브트리
    static int[] inOrder;
    static int[] inOrderIndex;
    static int[] postOrder;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine(), " ");
        inOrder = new int[n];
        inOrderIndex = new int[n + 1]; // 왜 배열의 크기가 다른지?
        postOrder = new int[n];

        for (int i = 0; i < n; i++) {
            inOrder[i] = Integer.parseInt(st.nextToken());
            inOrderIndex[inOrder[i]] = i;
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            postOrder[i] = Integer.parseInt(st.nextToken());
        }


        getPreOrder(0, n -1, 0 , n-1);
        System.out.println(sb.toString());


    }

    static void getPreOrder(int is, int ie, int ps, int pe) {
        if(ie < is || pe < ps) return;

        int root = postOrder[pe];
        int index = inOrderIndex[root];
        sb.append(root + " ");

        int len = index - is;

        getPreOrder(is, index - 1, ps, ps + len - 1);
        getPreOrder(index + 1, ie, ps + len, pe - 1);
    }
}
