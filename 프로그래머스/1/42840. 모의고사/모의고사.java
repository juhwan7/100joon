import java.util.*;

class Solution {
        int[] mathBan1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] mathBan2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] mathBan3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score1;
        int score2;
        int score3;

        public int[] solution(int[] answers) {
            int[] answer = new int[0];
            for (int i = 0; i < answers.length; i++) {
                if (mathBan1[i % mathBan1.length] == answers[i]) {
                    score1++;
                }
                if (mathBan2[i % mathBan2.length] == answers[i]) {
                    score2++;
                }
                if (mathBan3[i % mathBan3.length] == answers[i]) {
                    score3++;
                }
            }

            int maxScore = Math.max(Math.max(score1, score2), score3);
            List<Integer> list = new ArrayList<>();
            if (score1 == maxScore) list.add(1);
            if (score2 == maxScore) list.add(2);
            if (score3 == maxScore) list.add(3);
            answer = list.stream().mapToInt(i -> i).toArray();



            return answer;
        }
    }
