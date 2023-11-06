import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int[] count = new int[26];

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            count[(int) input.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < count.length; i++) {
            sb.append(count[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
