import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
   static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    static boolean[] check;
    static int N, M, V;
    static Queue<Integer> queue = new LinkedList<>(); // 선입선출 큐 선언

    public static void main(String[] args) throws IOException {
        // N 정점의 개수, M 간선의 개수, V 정점의 번호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 정점 개수
        M = Integer.parseInt(st.nextToken()); // 간선 개수
        V = Integer.parseInt(st.nextToken()); // 시작값

        arr = new int[N + 1][N + 1];
        check = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] = 1; // 2차원 배열 2곳에 1로 양방향 간선표시

        }
        dfs(V);
        sb.append("\n");
        check = new boolean[N + 1];

        bfs(V);
        System.out.println(sb);
    }


    public static void dfs(int start) {

        check[start] = true;
        sb.append(start + " ");

        for (int i = 0; i <= N; i++) {
            if (arr[start][i] == 1 && !check[i])
                dfs(i);
        }
    }

    public static void bfs(int start) {
        queue.add(start); // 큐 배열에 값 추가
        check[start] = true; // 다녀왔다고 표시

        while (!queue.isEmpty()) { // 큐가 비어있을 때까지
            start = queue.poll(); // 큐에서 첫번째 값을 빼면서 start에 대입(비어있느면 null 반환)
            sb.append(start + " ");
            for (int i = 1; i <= N; i++) {
                if (arr[start][i] == 1 && !check[i]) {
                    queue.add(i);
                    check[i] = true;
                }
            }

        }
    }
}
