class Solution {
    boolean solution(String s) {

        boolean answer = true;
        int leftCnt = 0;
        int rightCnt = 0;

        char[] cArr = s.toCharArray();
        int arrLength = cArr.length;
        
        for(int i=0; i < arrLength; i++){
            if((i == 0 && cArr[i] == ')') || ( i == arrLength -1 && cArr[arrLength-1] == '(')){
                answer = false;
                break;
            }
            
            
            if(cArr[i] == ')') rightCnt++;
            if(cArr[i] == '(') leftCnt++;
            
            if(rightCnt > leftCnt){
                answer = false;
            }
        }
        
        if(rightCnt != leftCnt) answer=false;

        return answer;
    }
}