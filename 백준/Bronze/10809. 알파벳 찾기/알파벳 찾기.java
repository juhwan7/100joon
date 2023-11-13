import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1; // 기본 값 -1로 초기화
        }
        String S = br.readLine();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (arr[ch - 'a'] == -1) { // 처음 들아온 값을 유지해야하기 때문에 값이 바뀌지 않은 -1인지 확인
                arr[ch - 'a'] = i;
            }
        }
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}
