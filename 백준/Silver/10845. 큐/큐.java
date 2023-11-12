import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/*      push X:정수 X를 큐에 넣는 연산이다.
        pop:큐에서 가장 앞에 있는 정수를 빼고,그 수를 출력한다.만약 큐에 들어있는 정수가 없는 경우에는-1을 출력한다.
        size:큐에 들어있는 정수의 개수를 출력한다.
        empty:큐가 비어있으면 1,아니면 0을 출력한다.
        front:큐의 가장 앞에 있는 정수를 출력한다.만약 큐에 들어있는 정수가 없는 경우에는-1을 출력한다.
        back:큐의 가장 뒤에 있는 정수를 출력한다.만약 큐에 들어있는 정수가 없는 경우에는-1을 출력한다.*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>(); // 자바에서 큐 생성 시 LinkedList를 사용해줘야 한다.

        int lastElement = -1; // 마지막으로 추가된 요소를 기억하는 변수
        for (int i = 0; i < N; i++) {
            String commend = br.readLine();
            String[] strCommend = commend.split(" ");

            switch (strCommend[0]) {
                case "push":
                    lastElement = Integer.parseInt(strCommend[1]);
                    queue.add(lastElement);
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        sb.append(queue.poll() + "\n");
                    } else {
                        sb.append(-1 + "\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size() + "\n"); // 큐 사이즈 반환
                    break;
                case "empty":
                    if (queue.isEmpty()) { // 큐가 공백이면 true
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        sb.append(queue.peek() + "\n"); // 가장 앞 데이터 확인
                    } else {
                        sb.append(-1 + "\n");
                    }
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        sb.append(lastElement+"\n");                    // head에 위치한 value 반환
                    } else {
                        sb.append(-1 + "\n");
                    }
                    break;
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
