import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5]; // 5개 배열선언
        Arrays.sort(num_list); // 오름차순 정렬
        for(int i=0; i<answer.length; i++){
          answer[i] = num_list[i];   
        }
        
        return answer;
    }
}