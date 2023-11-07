import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int M = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (binarySearch(arr, sc.nextInt()) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);

    }

    private static int binarySearch(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length-1;

        while (lo <= hi) { // 최소 값이 최대값보다 작을경우 실행
            int mid = (lo + hi) / 2; // 큰 값과 작은 값의 중간 값을 구함

            // key값이 중간 위치의 값보다 작은 경우
            if (key < arr[mid]) {
                hi = mid - 1;
            }

            // key값이 중간 위치의 값보다 클 경우
            else if (key > arr[mid]) {
                lo = mid + 1;
            } else if (key == arr[mid]) {
                return 1;
            }

            // key값이 중간 위치의 값이랑 같은 경우
        }
        return -1;
        // 찾고자 하는 값이 존재하지 않을 경우
    }
}
