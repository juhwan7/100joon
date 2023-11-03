import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> hashMap = new HashMap();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String pw = st.nextToken();
            hashMap.put(site, pw);
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            if (hashMap.containsKey(site)) {
                bw.write(hashMap.get(site)+"\n");
            }
        }
        br.close();
        bw.close();

    }
}
