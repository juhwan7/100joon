class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2]; // 배열 공간초기화
        
        while(s.length() > 1){ // 문자열 길이만큼 반복
            int cntOne = 0; // 1의 개수를 세어줄 int형 변수 선언
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){ // 글자마다 반복하며 0을 찾음
                    answer[1]++; // 0 개수마다 1번 인덱스 1추가
                }else{
                    cntOne++;
                }
            }
            
            s= Integer.toBinaryString(cntOne); // 1의 개수를 이진수로 변경
            answer[0]++;
        }
        return answer;
    }
}