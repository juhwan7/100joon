class Solution {
    public int solution(long num) {
        int answer = 0;
        
        for(int i=0; i<500; i++){
            if(num == 1){ // 입력된 수가 1이라면
                return answer;
            }
            if(num%2==0){ // 짝수라면
                num = num/2;
            }else{ // 홀수라면
                num = num*3+1;
            }
            answer++;
        }
        return -1;// 500회 이상 반복
    }
}