import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(new StringBuilder());
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] commend = br.readLine().split(" ");
            String stCommend = commend[0];
            int intCommend = 0;
            if (!(commend.length == 1)) {
                intCommend = Integer.parseInt(commend[1]);
            }
            switch (stCommend) {
                case "push_front":
                    deque.offerFirst(intCommend);
                    break;
                case "push_back":
                    deque.offerLast(intCommend);
                    break;
                case "pop_front":
                    if (!deque.isEmpty()) {
                        sb.append(deque.removeFirst());
                        sb.append("\n");
                    } else {
                        sb.append(-1);
                        sb.append("\n");
                    }
                    break;
                case "pop_back":
                    if (!deque.isEmpty()) {
                        sb.append(deque.removeLast());
                        sb.append("\n");
                    } else {
                        sb.append(-1);
                        sb.append("\n");
                    }
                    break;
                case "size":
                    sb.append(deque.size());
                    sb.append("\n");
                    break;
                case "empty":
                    if (!deque.isEmpty()) {
                        sb.append(0);
                    } else {
                        sb.append(1);
                    }
                    sb.append("\n");
                    break;
                case "front":
                    if (!deque.isEmpty()) {
                        sb.append(deque.getFirst());
                        sb.append("\n");
                    } else {
                        sb.append(-1);
                        sb.append("\n");
                    }
                    break;
                case "back":
                    if (!deque.isEmpty()) {
                        sb.append(deque.getLast());
                        sb.append("\n");
                    } else {
                        sb.append(-1);
                        sb.append("\n");
                    }
                    break;

            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
