import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int count;
        for (int i = 0; i < T; i++) {
            count = 0;
            String[] list = br.readLine().split("");
            for (int j = 0; j < list.length; j++) {
                if (count == -1) {
                    break;
                }
                if (list[j].equals("(")) {
                    count++;
                } else if (list[j].equals(")")) {
                    count--;
                }
            }
            if (count == 0) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }

        }
        System.out.println(sb);
    }
}
