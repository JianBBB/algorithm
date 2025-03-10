import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, Comparator.comparingInt(j -> j[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[1] != b[1]) return a[1] - b[1]; 
                return a[0] - b[0]; 
            }
        );

        int time = 0; 
        int totalTurnaroundTime = 0; 
        int jobIndex = 0;
        int completedJobs = 0; 

        while (completedJobs < jobs.length) {
         
            while (jobIndex < jobs.length && jobs[jobIndex][0] <= time) {
                pq.add(jobs[jobIndex]); 
                jobIndex++;
            }

            if (pq.isEmpty()) { 
                time = jobs[jobIndex][0]; 
            } else { 
                int[] job = pq.poll();
                time += job[1]; 
                totalTurnaroundTime += time - job[0]; 
                completedJobs++;
            }
        }

        return totalTurnaroundTime / jobs.length; 
    }
}
