class Solution {
    public String solution(String s) {
        String answer = "";
        int max = 0;
        int min = 0;
        
        String[] strList = s.split(" ");
        
        int[] numList = new int[strList.length];
        for(int i = 0; i<strList.length; i++){
            numList[i] = Integer.parseInt(strList[i]);
        }
  
    
        for(int i= 0; i<numList.length;i++){
            if(max==0){
                max = numList[i];
            }
            if(min==0){
                min = numList[i];
            }
            
            if(numList[i]>max){
                max = numList[i];
            }
            if(numList[i]<min){
                min = numList[i];
            }
        }
        answer = String.valueOf(min) +" "+ String.valueOf(max);
        
        return answer;
    }
}