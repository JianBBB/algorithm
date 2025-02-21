import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
            
        PriorityQueue<Integer> minScoville = new PriorityQueue<Integer>();
       for(int s: scoville){
           minScoville.add(s);
       }
        
        int mixCnt = 0; 
        
        while(minScoville.size() > 1 && minScoville.peek() < K){
            int first = minScoville.poll();
            int second = minScoville.poll();
            int newScoville = first + (second * 2); 
            
            minScoville.add(newScoville);
            mixCnt++;
        }
        
        if(minScoville.peek() < K) mixCnt = -1;
        
        return mixCnt;
        
    }
}