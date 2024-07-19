import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String array = br.readLine();

            char arr;

            for(int i = 0; i < array.length(); i++) {
                arr = array.charAt(i);
                if(!Character.isLetter(arr)) {
                    sb.append(arr);
                    continue;
                }

                int n = (int) arr + 13;

                if (Character.isUpperCase(arr) && n > 90) {
                    n -= 26;
                }

                //소문자일 때 122보다 크면 26 빼기
                if (Character.isLowerCase(arr) && n > 122) {
                    n -= 26;
                }

                sb.append((char) n);
            }


        System.out.println(sb.toString());




    }
}
