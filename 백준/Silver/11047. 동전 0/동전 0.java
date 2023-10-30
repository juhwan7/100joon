import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 동전 개수(단위 종류)
        int K = sc.nextInt(); // 목표 금액
        int A[] = new int[N]; // 동전 데이터 배열 선언
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt(); // 배열 값 추가
        }
        // 그리디 알고리즘 -> 최대한 큰 동전 먼저 사용하기
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] <= K) { // 보려는 동전의 가치가 목표금액보다 적으면
                count += (K / A[i]); // 값을 목표금액으로 나눈 몫을 count에 추가
                K = K % A[i]; // 계산하고 나머지를 K에 대입
            }
        }
        System.out.println(count);
    }
}
