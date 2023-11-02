class Solution {
    public boolean solution(int x) {
        int answer = 0;
        String[] strX = String.valueOf(x).split("");
        
        for(int i=0; i<strX.length; i++){
            answer += Integer.parseInt(strX[i]);
        }
        if(x%answer==0){
            return true;
        }
        return false;
    }
}