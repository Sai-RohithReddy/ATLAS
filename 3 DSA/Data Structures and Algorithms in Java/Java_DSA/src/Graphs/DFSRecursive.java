// Not working properly, Check code in AdjcentListRepresentation.java file

package Graphs;

import java.util.LinkedList;

public class DFSRecursive {
	
	public void dfsRec(int V, LinkedList<Integer>[] adj) {
		boolean[] visited = new boolean[V];
		for(int v = 0; v < V; v++) {
			if (!visited[v]) {
				dfs(v, visited, adj);
			}
		}
	}
	
	public void dfs(int v, boolean[] visited, LinkedList<Integer>[] adj) {
		visited[v] = true;
		System.out.print(v + " ");
		for(int w: adj[v]) {
			if (!visited[w]) {
				dfs(w, visited, adj);
			}
		}
	}

	public static void main(String[] args) {
		
		DFSRecursive dfs = new DFSRecursive();
		AdjecentListRepresentation g = new AdjecentListRepresentation(6);
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		
		System.out.println(g.toString());
		
		dfs.dfsRec(g.getV(), g.getAdj());
		
		
	}

}
