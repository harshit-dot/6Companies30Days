class Solution {
    
    class Node {
        int id;
        double p;
        public Node(int id, double p) {
            this.id = id;
            this.p = p;
        }
    }
    
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        
        List<Node>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            graph[edge[0]].add(new Node(edge[1], succProb[i]));
            graph[edge[1]].add(new Node(edge[0], succProb[i]));
        }
        double[] distance = new double[n];
        dijkstra(graph, start, distance);
        return distance[end];
    }
    
    private void dijkstra(List<Node>[] graph, int start, double[] distance) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>((x,y) -> x.p >= y.p ? -1 : 1);
        pq.add(new Node(start, 1.0));
        distance[start] = 1.0;
        while (!pq.isEmpty()) {
            Node pair = pq.poll();
            for (Node adj: graph[pair.id]) {
                if (pair.p * adj.p > distance[adj.id]) {
                    pq.add(new Node(adj.id, pair.p * adj.p));
                    distance[adj.id] = pair.p * adj.p;
                }
            }
        }
    }
}
