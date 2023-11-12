import com.sun.jdi.CharValue;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        // 열린 꺽새와 닫힌 컥새를 판별하기 위한 flag
        boolean flag = false;
        // 후입선출 기능을 이용하기 위한 자료구조 Stack
        Stack<Character> stack = new Stack<>();
        // 문자열 S의 길이만큼 반복문 수행
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                flag = true;
            } else if (str.charAt(i) == '>') {
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }
            // flag가 true일 경우(>를 만나기 전까지 그대로 입력)
            if (flag == true) {
                sb.append(str.charAt(i));
                // flag가 false일 경우 괄호 이외의 문자를 처리
            } else if (flag == false) {
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    stack.push(str.charAt(i));
                }
            }
            if (i == str.length()-1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }

        }
        System.out.println(sb);
    }
}

