package Graphs;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {
	public void depthFirstSearch(int s, int v, LinkedList<Integer>[] adj) {
		boolean[] visited = new boolean[v];
		Stack<Integer> stack = new Stack<>();
		stack.push(s);
		
		while(!stack.isEmpty()) {
			int u = stack.pop();
			if(!visited[u]) {
				visited[u] = true;
				System.out.print(u + " ");
				
				for (int val : adj[u]) {
					if (!visited[val]) {
						stack.push(val);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		
		DFS dfs = new DFS();
		AdjecentListRepresentation g = new AdjecentListRepresentation(5);
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		
		System.out.println(g.toString());
		
		dfs.depthFirstSearch(0, g.getV(), g.getAdj());

	}

}
