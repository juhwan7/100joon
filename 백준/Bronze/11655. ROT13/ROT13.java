import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        char[] toCharArray = br.readLine().toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {
            char charAt = toCharArray[i];
            if (charAt >= 'a' && charAt <= 'z') {
                charAt = (char) ((charAt - 'a' + 13) % 26 + 'a');
            } else if (charAt >= 'A' && charAt <= 'Z') {
                charAt = (char) ((charAt - 'A' + 13) % 26 + 'A');
            }

            sb.append(charAt);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
