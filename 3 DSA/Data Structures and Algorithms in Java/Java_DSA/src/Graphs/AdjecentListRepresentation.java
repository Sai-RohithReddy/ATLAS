package Graphs;

import java.util.LinkedList;

public class AdjecentListRepresentation {
	
	private LinkedList<Integer>[] adj;
	private int V; // number of vertices
	private int E; // number of edges
	
	public AdjecentListRepresentation(int node) {
		
		this.V = node;
		this.E = 0;
		this.adj = new LinkedList[node];
		
		for(int v = 0; v < V; v++) {
			adj[v] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	public int getV() {
		return V;
	}
	
	public LinkedList<Integer>[] getAdj(){
		return adj;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges " + "\n");
		for (int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for (int e : adj[v]) {
				sb.append(e + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public void dfs() {
		boolean[] visited = new boolean[V];
		for (int v = 0; v < V; v++) {
			if (!visited[v]) {
				dfs(v, visited);
			}
		}
	}
	
	public void dfs(int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v + " ");
		for(int w : adj[v]) {
			if(!visited[w]) {
				dfs(w, visited);
			}
		}
	}
	
	public static void main(String[] args) {

		AdjecentListRepresentation g = new AdjecentListRepresentation(4);
		AdjecentListRepresentation g1 = new AdjecentListRepresentation(6);

		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		
		System.out.println(g);
		System.out.println("******************************");
		
		g1.addEdge(0, 1);
		g1.addEdge(1, 2);
		g1.addEdge(2, 3);
		g1.addEdge(3, 0);
		g1.addEdge(2, 4);
		
		System.out.println(g1);
		g1.dfs(); // not working as expected!!

	}

}
