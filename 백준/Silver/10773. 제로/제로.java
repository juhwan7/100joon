import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        // 첫 번째 정수 K 받기
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        // 이후 정수 받기
        for (int i = 0; i < K; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                    stack.pop();
            } else {
                stack.push(a);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            result += stack.get(i);
        }
        System.out.println(result);
    }
}
