import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] numArray = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0;i<numArray.length;i++){
            answer+=numArray[i];
        }
        return answer;
    }
}