class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int pre_course = prerequisites[i][1];
            adj.get(pre_course).add(course);
        }
        // Visited states: 0 = unvisited, 1 = visiting, 2 = visited
        int[] visited = new int[numCourses];

        // Run DFS for each course
        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(adj, visited, i)) {
                return false;
            }
        }

        return true;
    }

    private boolean hasCycle(List<List<Integer>> adj, int[] visited, int course) {
        if (visited[course] == 1) return true; 
        if (visited[course] == 2) return false; 
        visited[course] = 1;
        for (int neighbor : adj.get(course)) {
            if (hasCycle(adj, visited, neighbor)) {
                return true;
            }
        }
        visited[course] = 2;
        return false;
    }
}
