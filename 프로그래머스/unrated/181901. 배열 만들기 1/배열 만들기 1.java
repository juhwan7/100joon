class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for(int i=0; i<n/k; i++){ // 범위 설정
            answer[i] = k*(i+1); // 배수 곱하기 i 번 연산 범위 전까지
        }
      
        return answer;
    }
}