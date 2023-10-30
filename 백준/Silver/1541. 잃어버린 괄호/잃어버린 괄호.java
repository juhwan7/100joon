import java.util.Scanner;

public class Main {
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine(); // 문자열 입력받기
        String[] str = example.split("-"); // - 로 나누기
        for (int i = 0; i < str.length; i++) { // 나눠진 만큼 반복
            int temp = mySum(str[i]);
            if (i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }
        System.out.println(answer);

    }

    private static int mySum(String a) {
        int sum = 0;
        String[] temp = a.split("[+]"); // 나눠진 문자열에서 +로 나누기
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
