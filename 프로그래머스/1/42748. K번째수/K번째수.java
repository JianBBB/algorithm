import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 1. commands의 행 개수만큼 배열 설정 
        int[] answer = new int[commands.length];
        int idx = 0; 
        
        for(int[] arr : commands){
            // 2. i,j,k 값 추출 
            int i = arr[0];
            int j = arr[1];
            int k = arr[2];
            
            // 3. i ~ j 까지 자른 후 추가  
            int[] subArr = Arrays.copyOfRange(array, i-1, j);
            
            // 4. 정렬 
            Arrays.sort(subArr);
            
            // 5. k 번째 숫자 찾아서 배열에 담기 
            answer[idx] = subArr[k-1];
            idx++;
        }
       
        
        
        
        return answer;
    }
}