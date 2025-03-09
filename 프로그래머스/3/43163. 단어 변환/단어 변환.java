import java.util.*;

// 그래프 자료구조 , BFS 알고리즘 적용 
// 최적의 경로 , 단계별로 이동 
// 한 단어의 차이 -> 단어 간 연결 가능 -> 그래프 활용 
// 단순히 변경할 수 있는 경로만을 찾는 것이 아니라 최적의 경로를 찾아야하므로 DFS가 아닌 BFS 적용 

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        // BFS 알고리즘 구현을 위해 Queue 생성 
        Queue<WordNode> queue = new ArrayDeque<>();
        // 방문한 흔적 남기기 위해 Set 생성 
        Set<String> visited = new HashSet<>();
       
        // 첫 단어를 queue에 삽입 
        queue.offer(new WordNode(begin, 0));
        // 첫 단어를 방문한 경로에 삽입 
        visited.add(begin);
        
        while (!queue.isEmpty()){
            
            WordNode current = queue.poll();
            String word = current.word;
            int step = current.step;
            
             
            if(word.equals(target)) return step;
            
            for(String nextWord : words){
                if(!visited.contains(nextWord) && isOneLetterDiff(word, nextWord)){
                    queue.offer(new WordNode(nextWord, step+1));
                    visited.add(nextWord);
                }
            }
        }
        
        return answer;
    }
    
    
    private boolean isOneLetterDiff(String word1, String word2){
        int diff = 0;
        for (int i=0; i <word1.length(); i++){
            if(word1.charAt(i) != word2.charAt(i)) diff++;
            if (diff > 1) return false;
        }
        return diff == 1;
    }
    
    
    static class WordNode {
        String word; 
        int step; 
        
        WordNode(String word, int step){
            this.word = word;
            this.step = step;
        }
    }
}