import java.util.ArrayList;
    
class Solution {
        static ArrayList<Integer> arrayList = new ArrayList<>();
        static boolean[] check = new boolean[7];

        public int solution(String numbers) {
            int answer = 0;

            for (int i = 0; i < numbers.length(); i++) {
                dfs(numbers, "", i + 1);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (prime(arrayList.get(i))) {
                    answer++;
                }
            }
            return answer;
        }

        static void dfs(String str, String temp, int m) {
            if (temp.length() == m) { // 문자열 길이 1자리부터 비교
                int num = Integer.parseInt(temp); //문자열 숫자로 바꾸기
                if (!arrayList.contains(num)) { // 배열에 포함되어 있지 않으면 추가
                    arrayList.add(num);
                }
            }
            for (int i = 0; i < str.length(); i++) {
                if (!check[i]) { // 체크 배열에 방문하지 않았으면
                    check[i] = true; // 체크배열에 방문표시 해주고
                    temp += str.charAt(i); // temp에 i 번째 위치 값 추가
                    dfs(str, temp, m);
                    check[i] = false;
                    temp = temp.substring(0, temp.length() - 1);
                }
            }

        }

        static boolean prime(int n) {
            if (n < 2) return false;

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }


    }