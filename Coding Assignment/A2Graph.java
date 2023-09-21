class Graph {
    int[][] edges;
    int vertex;

    public Graph(int vertex) {
        this.vertex = vertex;
        this.edges = new int[vertex][vertex];
    }

    public void addEdges(int src, int dest, int weight) {
        edges[src][dest] = weight;
        edges[dest][src] = weight;
    }

    public void shortestDistance(int source) {
        boolean[] visited = new boolean[vertex];
        int[] distance = new int[vertex];
        for (int i = 0; i < vertex; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        distance[source] = 0;
        
        for (int i = 0; i < vertex; i++) {
            int minDistVertix = findMinDistance(distance, visited);
            visited[minDistVertix] = true;
            for (int j = 0; j < vertex; j++) {
                if (!visited[j] && edges[minDistVertix][j] != 0 && (distance[minDistVertix] + edges[minDistVertix][j] < distance[j])) {
                    distance[j] = distance[minDistVertix] + edges[minDistVertix][j];
                }
            }
        }
        
        for (int i = 0; i < distance.length; i++) {
            System.out.printf("Distance for Person%s to Peron%s is %s\n", source, i, distance[i]);
        }
    }

    private int findMinDistance(int[] distance, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }

        return minDistanceVertex;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < vertex; i++) {
            for (int j : edges[i]) {
                s.append(j + " ");
            }
            s.append("\n");
        }

        return new String(s);
    }

}

public class A2Graph {
    public static void main(String[] args) {
        Graph g = new Graph(7);

        g.addEdges(0, 2, 1);
        g.addEdges(0, 3, 2);
        g.addEdges(1, 2, 2);
        g.addEdges(1, 5, 3);
        g.addEdges(2, 3, 1);
        g.addEdges(2, 4, 3);
        g.addEdges(6, 3, 1);
        g.addEdges(5, 4, 2);
        g.addEdges(6, 5, 1);

        System.out.println(g);

        g.shortestDistance(0);

    }
}
