import java.beans.Introspector;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();

        String[] readLine = br.readLine().split(" ");
        int N = Integer.parseInt(readLine[0]);
        int K = Integer.parseInt(readLine[1]);

        for (int i = 1; i <= N; i++) {
            arrayList.add(i);
        }
        int result = 0;
        sb.append("<");
        for (int i = 0; i < N; i++) {
            result = (result + K - 1) % arrayList.size();
            sb.append(arrayList.remove(result));
            if (i < N - 1) {
                sb.append(", ");
            }

        }
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
