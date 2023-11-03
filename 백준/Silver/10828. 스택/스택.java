import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch (S) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append(-1+"\n");
                    } else {
                        sb.append(stack.pop()+"\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()+"\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append(1+"\n");
                    } else {
                        sb.append(0+"\n");
                    }
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append(-1+"\n");
                    } else {
                        sb.append(stack.peek()+"\n");
                    }
                    break;
            }
        }
        System.out.println(sb);

    }
}
