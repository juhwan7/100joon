import javax.management.Query;
import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();

        String[] suffixes = new String[S.length()]; // String 배열 생성
        for (int i = 0; i < S.length(); i++) { // 한 글자씩 줄이며 배열에 넣기
            suffixes[i] = S.substring(i);
        }
        Arrays.sort(suffixes); // 배열 오름차순 정렬

        for (String suf : suffixes) { 
            bw.write(suf);  // 반복 출력
            bw.newLine(); // 줄바꿈
        }
        bw.flush();
        bw.close();
    }
}
