package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public void bredthFirstSearch(int s, int v, LinkedList<Integer>[] adj) {
		boolean[] visited = new boolean[v];
		
		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.offer(s);
		
		while(!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u + " ");
			
			for (int val : adj[u]) {
				if(!visited[val]) {
					visited[val] = true;
					q.offer(val);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		AdjecentListRepresentation g = new AdjecentListRepresentation(5);
		BFS bfs = new BFS();
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		
		System.out.println(g.getV());
		
		bfs.bredthFirstSearch(0, g.getV(), g.getAdj());

	}

}
