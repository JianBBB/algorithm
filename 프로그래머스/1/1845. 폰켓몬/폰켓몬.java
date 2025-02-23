import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        Set<Integer> numSet = new HashSet<>();
       
        for(int num : nums){
            numSet.add(num);
        }
        
        if(numSet.size() < max){
            max = numSet.size();
        }
        
        return max;
        
    
    }
}