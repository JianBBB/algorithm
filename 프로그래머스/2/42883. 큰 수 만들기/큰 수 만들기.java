import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        
        
        for (char num : number.toCharArray()) {
            /* 1.num : 1 
               2.num : 9
               3.num : 2 
               4.num : 4
            */
            while (!stack.isEmpty() && k > 0 && stack.peek() < num) {
            /*
                1. num : 1 / stack이 엠티라서 넘어감 
                2. num : 9 / stack에서 1이 사라지고 k는 1 
                3. num : 2 / stack.peek()한 값보다 num이 작아서 넘어감 
                3. num : 4 / stack에서 2가 사라지고 k는 0, 9보다 4가 커서 넘어감 
            */
                stack.pop();
                k--;
            }
            stack.push(num);
            /*
                1. stack : [1] / k: 2
                2. stack : [9] / k: 1
                3. stack : [9,2] / k: 1
                4. stack : [9,4] / k: 0
            */
        }
        
        // 이미 내림차순으로 정렬되어 있을 때 k가 제거되지 않고 모든 숫자가 stack에 들어감
        // 이런 경우 뒤에 숫자에서 k만큼의 값을 제거하면 됨 
        while (k > 0) {
            stack.pop();
            k--;
        }
        
        
        StringBuilder result = new StringBuilder();
        for (char num : stack) {
            result.append(num);
        }
        
        return result.toString();
    }
}