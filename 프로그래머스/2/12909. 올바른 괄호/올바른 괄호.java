class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 1;
        for(int i=0; i<s.length(); i++){
            
           if(s.substring(i,i+1).equals("(")){
               count++;
            }
            if(s.substring(i,i+1).equals(")")){
                count--;
            }
            if(count ==0){
                return false;
            }
        }
        
        if(count > 1){
            return false;
        }
        return answer;
    }
}