import java.util.*;

class Solution {
    public int minScore(int n, int[][] roads) {
        // Build adjacency list: node -> list of int[]{neighbor, distance}
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int dist = road[2];
            adj.get(u).add(new int[]{v, dist});
            adj.get(v).add(new int[]{u, dist});
        }
        
        // BFS Setup
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        
        queue.offer(1);
        visited[1] = true;
        
        int minScore = Integer.MAX_VALUE;
        
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            
            for (int[] neighbor : adj.get(curr)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];
                
                // Track the minimum edge weight seen anywhere in this component
                minScore = Math.min(minScore, weight);
                
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.offer(nextNode);
                }
            }
        }
        
        return minScore;
    }
}