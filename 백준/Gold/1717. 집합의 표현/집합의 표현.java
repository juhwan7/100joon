import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    static int parent[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        parent = new int[N + 1];// 자바 배열은 0부터 시작하기 때문
        for (int i = 0; i < N + 1; i++) {
            parent[i] = i; // i값으로 각각초기화
        }
        for (int i = 0; i < M; i++) {
            int question = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (question == 0) {// 0이면 합치라는 뜻
                union(a, b);
            } else { // 두 원소 비교
                boolean result = checkSame(a, b);
                if (result) System.out.println("YES");
                else System.out.println("NO");

            }
        }
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parent[b] = a; // 노드의 대표 노드 연결하기
        }
    }

    private static int find(int a) {
        if (a == parent[a]) return a;
        else {
            return parent[a] = find(parent[a]);
        }
    }

    private static boolean checkSame(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) return true;
        return false;
    }
}
